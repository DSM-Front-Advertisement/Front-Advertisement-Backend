package front_advertisement_backend.main.services.enrollment;

import front_advertisement_backend.main.entities.Enrollment;
import front_advertisement_backend.main.entities.Image;
import front_advertisement_backend.main.entities.repository.EnrollmentRepository;
import front_advertisement_backend.main.entities.repository.ImageRepository;
import front_advertisement_backend.main.payloads.requests.EnrollmentWriteRequest;
import front_advertisement_backend.main.payloads.responses.AdvertisementResponse;
import front_advertisement_backend.main.payloads.responses.SearchResponse;
import front_advertisement_backend.main.utils.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    private final ImageRepository imageRepository;

    private final S3Service s3Service;

    @Value("${image.upload.dir}")
    private String imageDirPath;

    @Override
    public Integer write(EnrollmentWriteRequest enrollmentWriteRequest) throws IOException {

        Enrollment enrollment = enrollmentRepository.save(
                Enrollment.builder()
                        .advertisementTitle(enrollmentWriteRequest.getAdvertisementTitle())
                        .advertisementCategoryType(enrollmentWriteRequest.getAdvertisementCategoryType())
                        .subLink(enrollmentWriteRequest.getSubLink())
                        .mediaType(enrollmentWriteRequest.getMediaType())
                        .youtubeLink(enrollmentWriteRequest.getYoutubeLink())
                        .build()
        );

        if (enrollmentWriteRequest.getMediaType() == 0) { // image
            Integer fileName = enrollment.getAdvertisementId();
            String originalFileName = enrollmentWriteRequest.getImageFile().getOriginalFilename();

            imageRepository.save(
                    Image.builder()
                            .fileName(fileName)
                            .advertisementId(enrollment.getAdvertisementId())
                            .originalFileName(originalFileName)
                            .build()
            );

            if (enrollmentWriteRequest.getImageFile() != null) {
                s3Service.upload(enrollmentWriteRequest.getImageFile(), fileName.toString());
            }
        }

        return enrollment.getAdvertisementId();
    }

    @Override
    public List<SearchResponse> search(String keyword) {
        List<SearchResponse> searchResponses = new ArrayList<>();

        for (Enrollment enrollment : enrollmentRepository.findAllByAdvertisementTitleContains(keyword)) {
            searchResponses.add(
                    SearchResponse.builder()
                            .title(enrollment.getAdvertisementTitle())
                            .subLink(enrollment.getSubLink())
                            .mediaType(enrollment.getMediaType())
                            .value(enrollment.getMediaType() == 0 ? enrollment.getAdvertisementId().toString() : enrollment.getYoutubeLink())
                            .build()
            );
        }

        return searchResponses;
    }

    @Override
    public AdvertisementResponse getAdvertisement(Integer advertisementId) {
        Enrollment enrollment = enrollmentRepository.findByAdvertisementId(advertisementId);

        return AdvertisementResponse.builder()
                .advertisementCategoryType(enrollment.getAdvertisementCategoryType())
                .advertisementId(enrollment.getAdvertisementId())
                .advertisementTitle(enrollment.getAdvertisementTitle())
                .imageId(enrollment.getAdvertisementId())
                .mediaType(enrollment.getMediaType())
                .subLink(enrollment.getSubLink())
                .youtubeLink(enrollment.getYoutubeLink())
                .build();
    }

}

package front_advertisement_backend.main.services.advertisement;

import front_advertisement_backend.main.entities.Enrollment;
import front_advertisement_backend.main.entities.repository.EnrollmentRepository;
import front_advertisement_backend.main.payloads.responses.AdvertiseListResponse;
import front_advertisement_backend.main.payloads.responses.AdvertisementResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdvertisementServiceImpl implements AdvertisementService {

    private final EnrollmentRepository enrollmentRepository;

    @Override
    public AdvertiseListResponse getAdvertisements(Pageable pageable) {
        Page<Enrollment> page = enrollmentRepository.findAllBy(pageable);

        List<AdvertisementResponse> advertisementResponses = new ArrayList<>();

        for(Enrollment enrollment : page) {
            advertisementResponses.add(
                    AdvertisementResponse.builder()
                            .youtubeLink(enrollment.getYoutubeLink())
                            .subLink(enrollment.getSubLink())
                            .mediaType(enrollment.getMediaType())
                            .imageId(enrollment.getAdvertisementId())
                            .advertisementTitle(enrollment.getAdvertisementTitle())
                            .advertisementId(enrollment.getAdvertisementId())
                            .advertisementCategoryType(enrollment.getAdvertisementCategoryType())
                            .build()
            );
        }

        return AdvertiseListResponse.builder()
                .totalElement((int) page.getTotalElements())
                .totalPage(page.getTotalPages())
                .advertiseResponse(advertisementResponses)
                .build();
    }

}

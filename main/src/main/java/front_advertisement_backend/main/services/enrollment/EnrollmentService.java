package front_advertisement_backend.main.services.enrollment;

import front_advertisement_backend.main.payloads.requests.EnrollmentWriteRequest;
import front_advertisement_backend.main.payloads.responses.AdvertisementResponse;
import front_advertisement_backend.main.payloads.responses.SearchResponse;

import java.io.IOException;
import java.util.List;

public interface EnrollmentService {
    Integer write(EnrollmentWriteRequest enrollmentWriteRequest) throws IOException;
    List<SearchResponse> search(String keyword);
    AdvertisementResponse getAdvertisement(Integer advertisementId);
}

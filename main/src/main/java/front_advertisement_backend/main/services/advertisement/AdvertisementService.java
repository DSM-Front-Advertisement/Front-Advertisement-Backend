package front_advertisement_backend.main.services.advertisement;

import front_advertisement_backend.main.payloads.responses.AdvertiseListResponse;
import org.springframework.data.domain.Pageable;

public interface AdvertisementService {
    AdvertiseListResponse getAdvertisements(Pageable pageable);
}

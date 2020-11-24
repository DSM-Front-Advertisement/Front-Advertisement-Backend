package front_advertisement_backend.main.controllers;

import front_advertisement_backend.main.payloads.responses.AdvertiseListResponse;
import front_advertisement_backend.main.services.advertisement.AdvertisementService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/advertisements")
@RequiredArgsConstructor
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    @GetMapping
    public AdvertiseListResponse getList(Pageable pageable) {
        return advertisementService.getAdvertisements(pageable);
    }

}

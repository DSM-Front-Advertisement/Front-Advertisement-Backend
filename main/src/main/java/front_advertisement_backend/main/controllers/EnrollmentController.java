package front_advertisement_backend.main.controllers;

import front_advertisement_backend.main.payloads.requests.EnrollmentWriteRequest;
import front_advertisement_backend.main.payloads.responses.AdvertisementResponse;
import front_advertisement_backend.main.payloads.responses.SearchResponse;
import front_advertisement_backend.main.services.enrollment.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/advertisement")
@RequiredArgsConstructor
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    @PostMapping
    public Integer write(@ModelAttribute @Valid EnrollmentWriteRequest enrollmentWriteRequest) throws IOException {
        return enrollmentService.write(enrollmentWriteRequest);
    }

    @GetMapping
    public List<SearchResponse> search(@RequestParam("keyword") @Valid String keyword) {
        return enrollmentService.search(keyword);
    }

    @GetMapping(value = "/{advertisementId}")
    public AdvertisementResponse getAdvertisement(@PathVariable Integer advertisementId) {
        return enrollmentService.getAdvertisement(advertisementId);
    }
}

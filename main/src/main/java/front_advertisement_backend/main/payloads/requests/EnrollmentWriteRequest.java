package front_advertisement_backend.main.payloads.requests;


import front_advertisement_backend.main.entities.category.AdvertisementCategoryType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class EnrollmentWriteRequest {

    @NotNull
    private Integer mediaType;

    @NotNull
    private String advertisementTitle;

    @NotNull
    private String subLink;

    @NotNull
    private AdvertisementCategoryType advertisementCategoryType;

    private String youtubeLink;

    private MultipartFile imageFile;
}


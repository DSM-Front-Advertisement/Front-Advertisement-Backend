package front_advertisement_backend.main.payloads.responses;

import front_advertisement_backend.main.entities.category.AdvertisementCategoryType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AdvertisementResponse {

    private Integer advertisementId;

    private Integer mediaType;

    private String advertisementTitle;

    private String subLink;

    private AdvertisementCategoryType advertisementCategoryType;

    private String youtubeLink;

    private Integer imageId;
}

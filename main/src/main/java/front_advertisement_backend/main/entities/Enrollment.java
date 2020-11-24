package front_advertisement_backend.main.entities;

import front_advertisement_backend.main.entities.category.AdvertisementCategoryType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer advertisementId;

    private AdvertisementCategoryType advertisementCategoryType;

    private Integer mediaType;

    private String advertisementTitle;

    private String subLink;

    private String youtubeLink;

}


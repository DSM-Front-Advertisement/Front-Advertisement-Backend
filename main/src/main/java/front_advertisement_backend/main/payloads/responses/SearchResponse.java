package front_advertisement_backend.main.payloads.responses;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SearchResponse {

    private String title;

    private String subLink;

    private Integer mediaType;

    private String value;
}

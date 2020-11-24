package front_advertisement_backend.main.payloads.responses;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class AdvertiseListResponse {

    private int totalElement;

    private int totalPage;

    private List advertiseResponse;
}

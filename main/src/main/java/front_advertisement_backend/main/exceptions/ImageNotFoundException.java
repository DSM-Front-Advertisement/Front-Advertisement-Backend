package front_advertisement_backend.main.exceptions;

import front_advertisement_backend.main.errors.BusinessException;
import front_advertisement_backend.main.errors.ErrorCode;

public class ImageNotFoundException extends BusinessException {
    public ImageNotFoundException() {
        super(ErrorCode.IMAGE_NOT_FOUND);
    }
}

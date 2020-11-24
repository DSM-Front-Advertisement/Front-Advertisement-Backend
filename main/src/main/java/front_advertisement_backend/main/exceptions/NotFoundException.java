package front_advertisement_backend.main.exceptions;

import front_advertisement_backend.main.errors.BusinessException;
import front_advertisement_backend.main.errors.ErrorCode;

public class NotFoundException extends BusinessException {
    public NotFoundException() { super(ErrorCode.NOT_FOUND); }
}
package front_advertisement_backend.main.exceptions;

import front_advertisement_backend.main.errors.BusinessException;
import front_advertisement_backend.main.errors.ErrorCode;

public class BadRequestException extends BusinessException {
    public BadRequestException() { super(ErrorCode.BAD_REQUEST); }
}
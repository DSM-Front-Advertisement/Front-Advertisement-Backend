package front_advertisement_backend.main.exceptions;

import front_advertisement_backend.main.errors.BusinessException;
import front_advertisement_backend.main.errors.ErrorCode;

public class ForbiddenTimeException extends BusinessException {
    public ForbiddenTimeException() { super(ErrorCode.FORBIDDEN_TIME); }
}
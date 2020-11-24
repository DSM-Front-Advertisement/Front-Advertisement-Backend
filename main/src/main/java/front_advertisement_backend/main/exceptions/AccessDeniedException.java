package front_advertisement_backend.main.exceptions;


import front_advertisement_backend.main.errors.BusinessException;
import front_advertisement_backend.main.errors.ErrorCode;

public class AccessDeniedException extends BusinessException {
    public AccessDeniedException() { super(ErrorCode.ACCESS_DENIED); }
}

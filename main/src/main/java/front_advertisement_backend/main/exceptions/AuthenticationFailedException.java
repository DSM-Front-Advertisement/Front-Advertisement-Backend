package front_advertisement_backend.main.exceptions;

import front_advertisement_backend.main.errors.BusinessException;
import front_advertisement_backend.main.errors.ErrorCode;

public class AuthenticationFailedException extends BusinessException {
    public AuthenticationFailedException() { super(ErrorCode.AUTHENTICATION_FAILED); }
}

package front_advertisement_backend.main.exceptions;

import front_advertisement_backend.main.errors.BusinessException;
import front_advertisement_backend.main.errors.ErrorCode;

public class UserAlreadyExistsException extends BusinessException {
    public UserAlreadyExistsException() {
        super(ErrorCode.USER_ALREADY_EXISTS);
    }
}
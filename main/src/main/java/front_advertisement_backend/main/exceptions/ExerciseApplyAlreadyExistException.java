package front_advertisement_backend.main.exceptions;

import front_advertisement_backend.main.errors.BusinessException;
import front_advertisement_backend.main.errors.ErrorCode;

public class ExerciseApplyAlreadyExistException extends BusinessException {
    public ExerciseApplyAlreadyExistException() {
        super(ErrorCode.EXERCISE_APPLY_ALREADY_EXISTS);
    }
}
package front_advertisement_backend.main.exceptions;

import front_advertisement_backend.main.errors.BusinessException;
import front_advertisement_backend.main.errors.ErrorCode;

public class ExerciseApplyFullException extends BusinessException {
    public ExerciseApplyFullException() {
        super(ErrorCode.EXERCISE_APPLY_FULL);
    }
}
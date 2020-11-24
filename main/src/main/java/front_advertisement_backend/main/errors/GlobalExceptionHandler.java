package front_advertisement_backend.main.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(front_advertisement_backend.main.errors.BusinessException.class)
    protected ResponseEntity<ErrorResponse> handleBusinessException(final front_advertisement_backend.main.errors.BusinessException e) {
        final ErrorCode errorCode = e.getErrorCode();

        return new ResponseEntity<>(new ErrorResponse(errorCode.getStatus(), e.getMessage()),
                HttpStatus.valueOf(errorCode.getStatus()));
    }

}

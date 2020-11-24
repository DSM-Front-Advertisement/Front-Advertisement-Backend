package front_advertisement_backend.main.errors;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    BAD_REQUEST(400, "Bad Request"),
    USER_ALREADY_EXISTS(409, "User alraedy exists"),
    EXERCISE_APPLY_ALREADY_EXISTS(409, "Exercise apply alraedy exists"),
    NOT_FOUND(404, "Not found"),
    PASSWORD_NOT_MATCH(403, "Password not match"),
    EXERCISE_APPLY_FULL(403, "Applies of that time are already full"),
    FORBIDDEN_TIME(403, "It's forbidden time to request"),
    ACCESS_DENIED(403, "Access denied"),
    AUTHENTICATION_FAILED(401, "Authentication failed"),
    IMAGE_NOT_FOUND(404, "Image Not Found");

    private final int status;

    private final String message;
}

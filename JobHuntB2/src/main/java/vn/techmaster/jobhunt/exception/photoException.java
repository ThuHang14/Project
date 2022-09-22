package vn.techmaster.jobhunt.exception;

import java.io.Serial;

public class photoException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 6288365963802085889L;

    public photoException(String message) {
        super(message);
    }

    public photoException(String message, Throwable cause) {
        super(message, cause);
    }
}
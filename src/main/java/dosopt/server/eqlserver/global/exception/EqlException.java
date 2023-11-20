package dosopt.server.eqlserver.global.exception;

public class EqlException extends RuntimeException {

    public EqlException(String message) {
        super(message);
    }

    public EqlException(String message, Throwable cause) {
        super(message, cause);
    }
}

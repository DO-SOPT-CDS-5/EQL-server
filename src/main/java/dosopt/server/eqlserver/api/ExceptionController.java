package dosopt.server.eqlserver.api;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import dosopt.server.eqlserver.common.dto.ApiResponse;
import dosopt.server.eqlserver.global.exception.IllegalArgumentException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionController {

    /**
     * 404 Bad Request
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    protected ApiResponse<Object> handleIllegalArgumentException(IllegalArgumentException exception) {
        log.error(exception.getMessage(), exception);
        return ApiResponse.error(HttpStatus.BAD_REQUEST, exception.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
            HttpMessageNotReadableException.class,
            InvalidFormatException.class,
            ServletRequestBindingException.class
    })
    protected ApiResponse<Object> handleInvalidFormatException(Exception exception) {
        log.error(exception.getMessage(), exception);
        return ApiResponse.error(HttpStatus.BAD_REQUEST, "검증되지 않은 요청 값이거나, 요청 값의 Type이 잘못되었습니다.");
    }

    /**
     * 405 Method Not Supported
     */
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    protected ApiResponse<Object> handleHttpRequestMethodNotSupportedException(
            HttpRequestMethodNotSupportedException exception) {
        return ApiResponse.error(HttpStatus.METHOD_NOT_ALLOWED, "Http Method가 잘못되었습니다.");
    }

    /**
     * 500 Internal Server Error
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    protected ApiResponse<Object> handleException(Exception exception) {
        log.error(exception.getMessage(), exception);
        return ApiResponse.error(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부에서 오류가 발생했습니다.");
    }

}

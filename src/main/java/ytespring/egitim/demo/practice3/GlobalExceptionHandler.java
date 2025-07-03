package ytespring.egitim.demo.practice3;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public String handleValidationException(MethodArgumentNotValidException e) {
        return e.getFieldErrors()
                .stream()
                .map(error -> "Field: " + error.getField() + ", Error: " + error.getDefaultMessage())
                .reduce((error1, error2) -> error1 + ";\n" + error2)
                .orElse("Validation failed with no specific errors.");
    }
}

package org.koreait.global.advices;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(annotations = RestController.class)
public class CommonRestControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String errorHandler(Exception e) {

        return e.getMessage();
    }
}

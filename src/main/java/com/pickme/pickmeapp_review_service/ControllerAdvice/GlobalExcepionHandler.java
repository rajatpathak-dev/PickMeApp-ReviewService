package com.pickme.pickmeapp_review_service.ControllerAdvice;

import com.pickme.pickmeapp_review_service.exception.ReviewNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExcepionHandler {

    @ExceptionHandler(ReviewNotFoundException.class)
    public ResponseEntity<?> handleReviewNotFoundException(ReviewNotFoundException reviewNotFoundException){
        return new ResponseEntity<>(reviewNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }

}

package com.pickme.pickmeapp_review_service.controller;

import com.pickme.pickmeapp_review_service.models.Review;
import com.pickme.pickmeapp_review_service.repository.ReviewRepo;
import com.pickme.pickmeapp_review_service.service.ReviewService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/review")
public class ReviewContoller {
    ReviewService reviewService;

    @GetMapping()
    public ResponseEntity<?> getAllReviews(){
        return new ResponseEntity<>(reviewService.getAllReviews(), HttpStatus.OK);
    }

    @GetMapping("/{reviewId}")
    public ResponseEntity<?> getOneReview(@PathVariable Long reviewId){
        return new ResponseEntity<>(reviewService.getOneReview(reviewId), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> saveReview(Review review){
        return new ResponseEntity<>(reviewService.saveReview(review), HttpStatus.OK);
    }

    @DeleteMapping("/{reviewId}")
    public ResponseEntity<?> deleteReview(@PathVariable Long reviewId){
        return new ResponseEntity<>(reviewService.deleteReview(reviewId),HttpStatus.OK);
    }


}

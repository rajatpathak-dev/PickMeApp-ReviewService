package com.pickme.pickmeapp_review_service.controller;

import com.pickme.pickmeapp_review_service.Dto.ReviewCreateDto;
import com.pickme.pickmeapp_review_service.Dto.ReviewReturnDto;
import com.pickme.pickmeapp_review_service.service.ReviewService;
import lombok.AllArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pickme.pickmeappentityservice.models.Review;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reviews")
public class ReviewContoller {
    ReviewService reviewService;

    @GetMapping()
    public ResponseEntity<?> getAllReviews(){
        List<Review> reviewList = reviewService.getAllReviews();
        List<ReviewReturnDto> reviewReturnDtoList = new ArrayList<>();
        for(Review review : reviewList){
            reviewReturnDtoList.add(new ReviewReturnDto(review));
        }
        return new ResponseEntity<>(reviewReturnDtoList, HttpStatus.OK);
    }

    @GetMapping("/{reviewId}")
    public ResponseEntity<?> getOneReview(@PathVariable Long reviewId){
        Review review = reviewService.getOneReview(reviewId);
        return new ResponseEntity<>(new ReviewReturnDto(review), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> saveReview(@RequestBody ReviewCreateDto review){
        Review review1 = reviewService.saveReview(review);
        return new ResponseEntity<>(new ReviewReturnDto(review1), HttpStatus.OK);
    }

    @DeleteMapping("/{reviewId}")
    public ResponseEntity<?> deleteReview(@PathVariable Long reviewId){
        Review review = reviewService.deleteReview(reviewId);
        return new ResponseEntity<>(new ReviewReturnDto(review),HttpStatus.OK);
    }


}

package com.pickme.pickmeapp_review_service.service;

import com.pickme.pickmeapp_review_service.exception.ReviewNotFoundException;
import com.pickme.pickmeapp_review_service.models.Review;
import com.pickme.pickmeapp_review_service.repository.ReviewRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService{
    private ReviewRepo reviewRepo;

    @Override
    public List<Review> getAllReviews() {
        return reviewRepo.findAll();
    }

    @Override
    public Review getOneReview(Long id) {
        return reviewRepo.findById(id).orElseThrow(()->{
            return new ReviewNotFoundException("Review with id "+id+" not found");
        });
    }

    @Override
    public Review saveReview(Review review) {
        return reviewRepo.save(review);
    }

    @Override
    public Review deleteReview(Long id) {
        Optional<Review> review = reviewRepo.findById(id);
        if(review.isEmpty()){
            throw  new ReviewNotFoundException("Review with id "+id+" not found");
        }
        return review.get();
    }
}

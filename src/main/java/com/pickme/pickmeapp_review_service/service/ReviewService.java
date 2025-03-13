package com.pickme.pickmeapp_review_service.service;

import com.pickme.pickmeapp_review_service.models.Review;

import java.util.List;

public interface ReviewService {
    public List<Review> getAllReviews();
    public Review getOneReview(Long id);
    public Review saveReview(Review review);
    public Review deleteReview(Long id);


}

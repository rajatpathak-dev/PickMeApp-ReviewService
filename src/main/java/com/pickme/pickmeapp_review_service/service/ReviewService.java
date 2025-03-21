package com.pickme.pickmeapp_review_service.service;

import com.pickme.pickmeapp_review_service.Dto.ReviewCreateDto;
import com.pickme.pickmeapp_review_service.Dto.ReviewReturnDto;
import com.pickme.pickmeapp_review_service.exception.BookingNotFoundException;
import com.pickme.pickmeappentityservice.models.Review;


import java.util.List;

public interface ReviewService {
    public List<Review> getAllReviews();
    public Review getOneReview(Long id);
    public Review saveReview(ReviewCreateDto review) throws BookingNotFoundException;
    public Review deleteReview(Long id);


}

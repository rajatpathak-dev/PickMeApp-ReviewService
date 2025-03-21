package com.pickme.pickmeapp_review_service.service;

import com.pickme.pickmeapp_review_service.Dto.ReviewCreateDto;
import com.pickme.pickmeapp_review_service.exception.BookingNotFoundException;
import com.pickme.pickmeapp_review_service.exception.ReviewNotFoundException;
import com.pickme.pickmeapp_review_service.repository.BookingsRepo;
import com.pickme.pickmeapp_review_service.repository.ReviewRepo;
import com.pickme.pickmeappentityservice.models.Booking;
import com.pickme.pickmeappentityservice.models.Review;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService{
    private ReviewRepo reviewRepo;
    private BookingsRepo bookingsRepo;

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
    public Review saveReview(ReviewCreateDto review) {
        Optional<Booking> bookingOptional = bookingsRepo.findById(review.getBooking());
        if(bookingOptional.isEmpty()){
            throw new BookingNotFoundException("booking with id "+review.getBooking()+" not found");
        }

        Review postReview = Review.builder()
                .content(review.getContent())
                .rating(review.getRating())
                .booking(bookingOptional.get())
                .build();


        return reviewRepo.save(postReview);
    }

    @Override
    public Review deleteReview(Long id) {
        Optional<Review> review = reviewRepo.findById(id);
        if(review.isEmpty()){
            throw  new ReviewNotFoundException("Review with id "+id+" not found");
        }

        reviewRepo.deleteById(id);
        return review.get();
    }
}

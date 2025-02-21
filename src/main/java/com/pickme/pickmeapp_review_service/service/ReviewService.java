package com.pickme.pickmeapp_review_service.service;

import com.pickme.pickmeapp_review_service.models.Review;
import com.pickme.pickmeapp_review_service.repository.ReviewRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewService implements CommandLineRunner {
    ReviewRepo reviewRepo;

    public ReviewService(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public void run(String... args) throws Exception {
     Review review = Review.builder()
             .content("amazing Ride sir")
             .rating(4.5).build();

     reviewRepo.save(review);


    }
}

package com.pickme.pickmeapp_review_service.service;

import com.pickme.pickmeapp_review_service.models.Booking;
import com.pickme.pickmeapp_review_service.models.BookingStatus;
import com.pickme.pickmeapp_review_service.models.Review;
import com.pickme.pickmeapp_review_service.repository.BookingsRepo;
import com.pickme.pickmeapp_review_service.repository.ReviewRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {
    ReviewRepo reviewRepo;
    BookingsRepo bookingsRepo;

    public ReviewService(ReviewRepo reviewRepo , BookingsRepo bookingsRepo) {
        this.reviewRepo = reviewRepo;
        this.bookingsRepo = bookingsRepo;
    }

    @Override
    public void run(String... args) throws Exception {



//
//        Review review = Review.builder()
//                .content("amazing Ride sir")
//                .rating(4.5).build();
//
//        Booking booking = Booking.builder()
//                .bookingStatus(BookingStatus.COMPLETED)
//                .start(LocalDateTime.now())
//                .review(review)
//                .build();
//
//
//
//        Review review1 = Review.builder()
//                .content("amazing Ride sir")
//                .rating(4.5).build();
//
//        Booking booking1 = Booking.builder()
//                .bookingStatus(BookingStatus.COMPLETED)
//                .start(LocalDateTime.now())
//                .review(review1)
//                .build();

//        reviewRepo.save(review);
//        reviewRepo.save(review1);

//        bookingsRepo.save(booking);
//        bookingsRepo.save(booking1);

//        reviewRepo.save(review);
//        reviewRepo.deleteById(1l);

//          bookingsRepo.deleteById(2l);


    }
}

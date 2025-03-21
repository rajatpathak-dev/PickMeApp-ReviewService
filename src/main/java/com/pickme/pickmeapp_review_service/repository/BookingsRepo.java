package com.pickme.pickmeapp_review_service.repository;


import com.pickme.pickmeappentityservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingsRepo extends JpaRepository<Booking,Long> {
}

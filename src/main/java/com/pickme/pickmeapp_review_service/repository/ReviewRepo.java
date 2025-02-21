package com.pickme.pickmeapp_review_service.repository;

import com.pickme.pickmeapp_review_service.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review,Long>{
}

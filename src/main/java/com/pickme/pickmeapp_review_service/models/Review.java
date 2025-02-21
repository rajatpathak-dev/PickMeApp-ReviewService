package com.pickme.pickmeapp_review_service.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "booking_reviews")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(nullable = false)
   private String content;
   private Double rating;


    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime createAt;


    @Column(nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}

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
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel {


   private String content;

   @Column(nullable = false)
   private Double rating;

   @OneToOne(cascade = {CascadeType.ALL})
   @JoinColumn(nullable = false,name = "booking_id")
   private Booking booking;

}

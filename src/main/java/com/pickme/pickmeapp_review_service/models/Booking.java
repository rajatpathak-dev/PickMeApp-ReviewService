package com.pickme.pickmeapp_review_service.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends  BaseModel{

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name = "review_id")
    private Review review;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;
    private LocalDateTime start;
    private LocalDateTime end;
    private Long distance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;
}

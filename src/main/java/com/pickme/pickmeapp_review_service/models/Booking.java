package com.pickme.pickmeapp_review_service.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Builder
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Booking extends  BaseModel{



    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;
    private LocalDateTime start;
    private LocalDateTime end;
    private Long distance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;
}

package com.pickme.pickmeapp_review_service.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel{

    private  String name;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookingList = new ArrayList<>();
}

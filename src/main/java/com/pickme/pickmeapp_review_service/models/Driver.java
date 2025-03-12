package com.pickme.pickmeapp_review_service.models;

import jakarta.persistence.Column;
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
    private String phoneNo;

    @Column(nullable = false,unique = true)
    private String licenseNo;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookingList = new ArrayList<>();
}

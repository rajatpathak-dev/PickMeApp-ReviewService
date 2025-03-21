package com.pickme.pickmeapp_review_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EntityScan("com.pickme.pickmeappentityservice.models")
public class PickMeAppReviewServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PickMeAppReviewServiceApplication.class, args);
    }

}

package com.pickme.pickmeapp_review_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class PickMeAppReviewServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PickMeAppReviewServiceApplication.class, args);
    }

}

package com.pickme.pickmeapp_review_service.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class ReviewCreateDto {
    private String content;
    private Double rating;
    private long booking;

}
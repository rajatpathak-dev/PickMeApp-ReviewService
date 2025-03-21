package com.pickme.pickmeapp_review_service.Dto;

import com.pickme.pickmeappentityservice.models.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ReviewReturnDto implements Serializable {
    private  Long id;
    private  LocalDateTime createAt;
    private  LocalDateTime updatedAt;
    private  String content;
    private  Double rating;

    public ReviewReturnDto(Review review) {
        this.id = review.getId();
        this.content = review.getContent();
        this.rating = review.getRating();
        this.createAt = review.getCreateAt();
        this.updatedAt = review.getUpdatedAt();
    }
}
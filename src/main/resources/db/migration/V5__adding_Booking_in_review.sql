ALTER TABLE booking
DROP
FOREIGN KEY FK_BOOKING_ON_REVIEW;

ALTER TABLE booking_reviews
    ADD booking_id BIGINT NULL;

ALTER TABLE booking_reviews
    MODIFY booking_id BIGINT NOT NULL;

ALTER TABLE booking_reviews
    ADD CONSTRAINT uc_booking_reviews_booking UNIQUE (booking_id);

ALTER TABLE booking_reviews
    ADD CONSTRAINT FK_BOOKING_REVIEWS_ON_BOOKING FOREIGN KEY (booking_id) REFERENCES booking (id);

ALTER TABLE booking
DROP
COLUMN review_id;

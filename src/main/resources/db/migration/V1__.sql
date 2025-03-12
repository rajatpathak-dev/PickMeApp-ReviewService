CREATE TABLE booking
(
    id             BIGINT AUTO_INCREMENT NOT NULL,
    create_at      datetime NOT NULL,
    updated_at     datetime NOT NULL,
    review_id      BIGINT NULL,
    booking_status ENUM('SCHEDULED', 'CANCEL', 'ASSIGNING_DRIVER',
        'CAB_REACHED', 'IN_RIDE', 'COMPLETED') NULL,
    start          datetime NULL,
    end            datetime NULL,
    distance       BIGINT NULL,
    driver_id      BIGINT NULL,
    passenger_id   BIGINT NULL,
    CONSTRAINT pk_booking PRIMARY KEY (id)
);

CREATE TABLE booking_reviews
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    create_at  datetime NOT NULL,
    updated_at datetime NOT NULL,
    content    VARCHAR(255) NULL,
    rating DOUBLE NOT NULL,
    CONSTRAINT pk_booking_reviews PRIMARY KEY (id)
);

CREATE TABLE driver
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    create_at  datetime NOT NULL,
    updated_at datetime NOT NULL,
    name       VARCHAR(255) NULL,
    CONSTRAINT pk_driver PRIMARY KEY (id)
);

CREATE TABLE passenger
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    create_at  datetime NOT NULL,
    updated_at datetime NOT NULL,
    name       VARCHAR(255) NULL,
    CONSTRAINT pk_passenger PRIMARY KEY (id)
);

CREATE TABLE passenger_review
(
    id                       BIGINT NOT NULL,
    passenger_review_content VARCHAR(255) NULL,
    passenger_rating DOUBLE NOT NULL,
    CONSTRAINT pk_passengerreview PRIMARY KEY (id)
);

ALTER TABLE booking
    ADD CONSTRAINT uc_booking_review UNIQUE (review_id);

ALTER TABLE booking
    ADD CONSTRAINT FK_BOOKING_ON_DRIVER FOREIGN KEY (driver_id) REFERENCES driver (id);

ALTER TABLE booking
    ADD CONSTRAINT FK_BOOKING_ON_PASSENGER FOREIGN KEY (passenger_id) REFERENCES passenger (id);

ALTER TABLE booking
    ADD CONSTRAINT FK_BOOKING_ON_REVIEW FOREIGN KEY (review_id) REFERENCES booking_reviews (id);

ALTER TABLE passenger_review
    ADD CONSTRAINT FK_PASSENGERREVIEW_ON_ID FOREIGN KEY (id) REFERENCES booking_reviews (id);
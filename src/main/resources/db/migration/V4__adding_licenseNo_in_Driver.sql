ALTER TABLE driver
    ADD license_no VARCHAR(255) NULL;

ALTER TABLE driver
    MODIFY license_no VARCHAR (255) NOT NULL;

ALTER TABLE driver
    ADD CONSTRAINT uc_driver_license_no UNIQUE (license_no);


ALTER TABLE driver
    ADD email VARCHAR(255) NULL;

ALTER TABLE driver
    ADD phone_no VARCHAR(255) NULL;

ALTER TABLE booking
DROP
COLUMN booking_status;

ALTER TABLE booking
    ADD booking_status ENUM('SCHEDULED', 'CANCEL', 'ASSIGNING_DRIVER',
                'CAB_REACHED', 'IN_RIDE', 'COMPLETED') NULL;
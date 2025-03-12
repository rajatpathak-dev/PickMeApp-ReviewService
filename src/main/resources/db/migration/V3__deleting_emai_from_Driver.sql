ALTER TABLE driver
DROP
COLUMN email;

ALTER TABLE booking
DROP
COLUMN booking_status;

ALTER TABLE booking
    ADD booking_status ENUM('SCHEDULED', 'CANCEL', 'ASSIGNING_DRIVER',
                'CAB_REACHED', 'IN_RIDE', 'COMPLETED') NULL;
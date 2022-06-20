package com.booking.bookingagency.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Flight extends OrderLine {

    public Flight(
            LocalDate fromDate,
            LocalDate toDate,
            double price,
            Order orderId,
            int flightNumber,
            String airline) {
        super(fromDate, toDate, price, orderId);
        this.flightNumber = flightNumber;
        this.airline = airline;
    }

    @Column
    private int flightNumber;

    @Column
    private String airline;
}

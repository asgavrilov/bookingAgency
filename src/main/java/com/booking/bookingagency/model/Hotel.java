package com.booking.bookingagency.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Hotel extends OrderLine {

    public Hotel(
            LocalDate fromDate,
            LocalDate toDate,
            double price,
            Order orderId,
            String hotelName,
            RoomType roomType) {
        super(fromDate, toDate, price, orderId);
        this.hotelName = hotelName;
        this.roomType = roomType;
    }

    @Column
    private String hotelName;

    @Column
    @Enumerated(value = EnumType.STRING)
    private RoomType roomType;
}

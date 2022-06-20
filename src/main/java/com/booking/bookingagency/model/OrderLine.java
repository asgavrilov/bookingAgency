package com.booking.bookingagency.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "orderLines")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class OrderLine {
    @Id
    @GeneratedValue
    @Column(name = "orderLineId", nullable = false)
    private Long id;

    @Column
    @NonNull
    private LocalDate fromDate;

    @Column
    @NonNull
    private LocalDate toDate;

    @Column
    @NonNull
    private double price;

    @ManyToOne
    @NonNull
    @JoinColumn(name = "order_id")
    private Order orderId;

}

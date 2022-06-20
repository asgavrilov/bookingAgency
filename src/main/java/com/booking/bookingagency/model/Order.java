package com.booking.bookingagency.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    @NonNull
    private LocalDate orderDate;
    @Column
    @NonNull
    private LocalDate fromDate;
    @Column
    @NonNull
    private LocalDate toDate;

    @ManyToMany
    @NonNull
    Set<Participant> participants;

}

package com.booking.bookingagency.config;

import com.booking.bookingagency.model.*;
import com.booking.bookingagency.repo.OrderLinesRepository;
import com.booking.bookingagency.repo.OrdersRepository;
import com.booking.bookingagency.repo.ParticipantsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Set;

@Component
@AllArgsConstructor
public class InitialData {

    private OrderLinesRepository orderlinesRepository;
    private OrdersRepository ordersRepository;
    private ParticipantsRepository participantsRepository;

    @PostConstruct
    void init() {
        Participant participant = new Participant("Alex", "G",
                LocalDate.of(1886, 03, 14));
        Participant participant2 = new Participant("Dima", "Go",
                LocalDate.of(1984, 05, 14));

        Order order = new Order(
                LocalDate.now(),
                LocalDate.of(2022, 07, 01),
                LocalDate.of(2022, 07, 20),
                Set.of(participant));

        Order order2 = new Order(
                LocalDate.now(),
                LocalDate.of(2022, 07, 20),
                LocalDate.of(2022, 07, 30),
                Set.of(participant, participant2));

        OrderLine orderLine = new Flight(
                LocalDate.of(2022, 07, 01),
                LocalDate.of(2022, 07, 02),
                44000, order, 1466, "Lufthansa");

        OrderLine orderLine1 = new Hotel(
                LocalDate.of(2022, 07, 02),
                LocalDate.of(2022, 07, 12),
                8000.00,
                order,
                "Sheraton",
                RoomType.SINGLE);

        OrderLine orderLine21 = new Flight(
                LocalDate.of(2022, 07, 20),
                LocalDate.of(2022, 07, 30),
                44000, order2, 1444, "Lufthansa");

        saveData(participant, participant2, order, order2, orderLine, orderLine1, orderLine21);
    }

    @Transactional
    void saveData(
            Participant participant,
            Participant participant2,
            Order order,
            Order order2,
            OrderLine orderLine,
            OrderLine orderLine1,
            OrderLine orderLine21) {
        participantsRepository.save(participant);
        participantsRepository.save(participant2);

        ordersRepository.save(order);
        ordersRepository.save(order2);

        orderlinesRepository.save(orderLine);
        orderlinesRepository.save(orderLine1);
        orderlinesRepository.save(orderLine21);
    }
}

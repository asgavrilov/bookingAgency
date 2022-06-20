package com.booking.bookingagency.repo;

import com.booking.bookingagency.model.OrderLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLinesRepository extends CrudRepository<OrderLine, Long> {
}

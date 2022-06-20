package com.booking.bookingagency.repo;

import com.booking.bookingagency.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Order, Long> {
}

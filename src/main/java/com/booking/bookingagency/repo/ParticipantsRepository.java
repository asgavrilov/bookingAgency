package com.booking.bookingagency.repo;

import com.booking.bookingagency.model.Participant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantsRepository extends CrudRepository<Participant, Long> {
}

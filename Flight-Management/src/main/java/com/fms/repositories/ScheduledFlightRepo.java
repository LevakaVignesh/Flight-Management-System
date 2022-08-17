package com.fms.repositories;
import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.entity.ScheduledFlight;

@Repository
public interface ScheduledFlightRepo extends CrudRepository<ScheduledFlight,String> {

	Optional<ScheduledFlight> findById(String flightId);


	
}

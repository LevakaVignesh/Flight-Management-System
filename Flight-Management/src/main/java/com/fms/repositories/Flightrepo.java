package com.fms.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fms.entity.Flight;

@Repository
public interface Flightrepo extends JpaRepository<Flight,String> {
	List<Flight> findByFlightId(String userId);
   // String deleteByFlightId(String flightId);
//	List<Flight> findByName(String name);
	
}

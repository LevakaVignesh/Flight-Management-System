package com.fms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fms.entity.Airport;
@Repository
public interface AirportRepo extends JpaRepository<Airport,String> {
	List<Airport> findByairportId(String airportID);
	List<Airport> findByairportName(String aiportName);
   // String deleteByFlightId(String flightId);
//	List<Flight> findByName(String name);
	//String deleteByairportName(String airportName);
	String deleteByairportName(String airportName);
	
	
}

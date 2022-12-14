package com.fms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {

	List<Booking> findByBookingId(Integer bid);

	boolean existsById(Integer bid);

	void deleteById(Integer bid);

}
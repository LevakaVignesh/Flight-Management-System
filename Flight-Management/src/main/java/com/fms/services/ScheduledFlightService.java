package com.fms.services;
import java.math.BigInteger;

import com.fms.entity.ScheduledFlight;
import com.fms.exceptions.RecordNotFoundException;
import com.fms.exceptions.ScheduledFlightNotFoundException;

public interface ScheduledFlightService {
	public ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight);

	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight);

	public String removeScheduledFlight(BigInteger id) throws RecordNotFoundException;

	public Iterable<ScheduledFlight> viewAllScheduledFlights();

	public ScheduledFlight viewScheduledFlight(BigInteger id) throws ScheduledFlightNotFoundException;
}
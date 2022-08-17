package com.fms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "schedule")
public class Schedule {
	@Id
	private String scheduleID;
	// @OneToOne(cascade = CascadeType.MERGE)
	private String sourceAirport;
	// @OneToOne(cascade = CascadeType.MERGE)
	private String destinationAirport;
	private String arrivalDate;
	private String departureDate;
	private Integer ticketcost;

	
}

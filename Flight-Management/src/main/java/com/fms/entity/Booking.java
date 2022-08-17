package com.fms.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name = "booking")
@Data
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingId;
	@NotNull
	private Integer noOfPassengers;
	@Temporal(TemporalType.DATE)
	private Date bookingdate;
	@NotBlank
	private String sourceAirport;
	@NotBlank
	private String destinationAirport;
@OneToMany(cascade = CascadeType.MERGE)
	private List<Passenger> passengerList;
}

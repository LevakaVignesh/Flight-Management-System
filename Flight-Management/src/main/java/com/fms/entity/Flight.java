package com.fms.entity;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity

@Table(name = "Flight_Info")
@Data
public class Flight {
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)

	private String flightId;
	@NotBlank
	private String carrierName;
	@NotBlank
	private String flightModel;
	@NotNull
	private int seatCapacity;

}

package com.fms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="passenger")
@Data
public class Passenger {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer passengerUIN;
	private Integer passengerAge;
	private Integer pnrNumber;
	private String passengerName;
	private Double luggage;
	
	
}

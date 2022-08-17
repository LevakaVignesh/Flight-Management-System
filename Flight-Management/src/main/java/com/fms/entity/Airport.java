package com.fms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name = "Airports")
@Data
public class Airport {
	@Id
	@NotNull
	private String airportId;
	@NotBlank
	private String airportName;
	@NotBlank
	private String airportLocation;

}

package com.fms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "users")
public class User {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String userId;
	@Column
	//@NotNull
	//@NotBlank(message="Please enter a phone number")
	//@Size(min=10,max=10,message="Invalid Phone Number")
	private String phoneNo;
	@Column
	//@Email(message="invalid Email id")
	//@NotBlank(message="Email cannot be blank")
	private String userEmail;
	@Column
	//@NotNull
	//@NotBlank(message="Please enter a name")
	private String userName;
	@Column
	//@NotNull
	//@NotBlank(message="Please enter usertype")
	private String userType;
	@Column
	//@NotNull
	//@NotBlank(message="Please enter a password")
	private String password;


	
}


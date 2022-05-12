package com.submitform.app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Getter;
import lombok.Setter;

@Entity
//@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name="persons")
@Getter
@Setter
public class Persons {
	
	@Id
	@Column(name="PersonID")
	private Long id;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="City")
	private String city;

	@Override
	public String toString() {
		return "Persons [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", address=" + address
				+ ", city=" + city + "]";
	}
	
	
	
	
}

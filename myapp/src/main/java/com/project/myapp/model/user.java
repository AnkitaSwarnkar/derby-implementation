package com.project.myapp.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class user {

	@Id
	private String firstname;
	private String lastname;
	private String occupation;
	private Date dob;
	private String addressline1;
	private String addressline2;
	private String pincode;
	private String state;
	private String city;
	
	
	
	public user() {
	}
	
		
	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getOccupation() {
		return occupation;
	}



	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public String getAddressline1() {
		return addressline1;
	}



	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}



	public String getAddressline2() {
		return addressline2;
	}



	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}



	public String getPincode() {
		return pincode;
	}



	public void setPincode(String pincode) {
		this.pincode = pincode;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}

}

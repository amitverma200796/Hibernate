package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
@Column(length=10)
private String hno;
@Column(length=12)
private String street;
@Column(length=14)
private String city;
	
public Address()
{
	
}
	
public Address(String hno,String street,String city)
{
	this.hno=hno;
	this.street=street;
	this.city=city;
	
	
}

public String getHno() {
	return hno;
}

public void setHno(String hno) {
	this.hno = hno;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
	
	
	
}

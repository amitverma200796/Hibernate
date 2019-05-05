package com.sathya.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="passport_tab")
public class Passport {
@Id
private int passid;
@Temporal(TemporalType.DATE)

private Date expdate;
@ManyToOne(cascade=CascadeType.ALL)

@JoinColumn(name="pid_fk",nullable=false,unique=true)
private Person person;
public int getPassid() {
	return passid;
}
public void setPassid(int passid) {
	this.passid = passid;
}
public Date getExpdate() {
	return expdate;
}
public void setExpdate(Date expdate) {
	this.expdate = expdate;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}




}

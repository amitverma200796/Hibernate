package com.sathya.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loan_tab")
public class Loan {
	@Id
	@Column(length=12)
private String loanId;
	
private double  amount;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="custid_fk")
private Customer customer;
public String getLoanId() {
	return loanId;
}
public void setLoanId(String loanId) {
	this.loanId = loanId;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}








}





	
	
	

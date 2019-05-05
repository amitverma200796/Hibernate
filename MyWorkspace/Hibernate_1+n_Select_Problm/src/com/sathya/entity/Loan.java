package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_tab")
public class Loan {
	@Id
	@Column(length=12)
private String loanId;
	
	private double  amaount;
	
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public double getAmaount() {
		return amaount;
	}
	public void setAmaount(double amaount) {
		this.amaount = amaount;
	}
	
	
	
}

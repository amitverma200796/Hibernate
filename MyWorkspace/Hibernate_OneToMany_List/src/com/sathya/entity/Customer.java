package com.sathya.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
@Entity
@Table(name="customer_tab")
public class Customer
{
	private static final boolean TRUE = false;
	@Id
	@Column(length=12)
	private String custId;
	@Column(length=12)
	
	private String custName;
	
	
@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
 @JoinColumn(name="custid_k")
 @OrderColumn(name="laon_order")
 
	
    private List<Loan> loans;
	
    public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	
	
	
	
	
	
	
}

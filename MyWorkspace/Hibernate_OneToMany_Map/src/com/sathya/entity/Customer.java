package com.sathya.entity;


import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="customer_tab")
public class Customer
{
	
	@Id
	@Column(length=12)
	private String custId;
	@Column(length=12)
	
	private String custName;
	
	
@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
 @JoinColumn(name="custid_k")
 @MapKeyColumn(name="key_name",length=10,nullable=true)
 
	
    private Map <String,Loan> loans;
	
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
	public Map<String,Loan> getLoans() {
		return loans;
	}
	public void setLoans(Map<String,Loan> loans) {
		this.loans = loans;
	}
	
	
	
	
	
	
	
}

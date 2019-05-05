package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_tab")
public class Employee {
@Id
private int empId;
@Column(length=12)
private String empName;
@Embedded
private Address address;

public Employee()
{
	
}
	public Employee(int empId,String empName,Address address)
	{
		this.empId=empId;
		this.empName=empName;
		this.address=address;
		
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
		
		
	}
	
	


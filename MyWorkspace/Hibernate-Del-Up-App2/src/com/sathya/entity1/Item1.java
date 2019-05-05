package com.sathya.entity1;

public class Item1 {
	private int empId;
	private String empName;
	private double sal;
	public Item1()
	{

	}
	//minimal constructor
	public Item1(int empId)
	{
		this.empId=empId;
	}
	//full constructor
	public Item1(int empId,String empName,double sal)
	{
		this.empId=empId;
		this.empName=empName;
		this.sal=sal;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String toString()
	{
	return "Item1[empId= "+empId+", empName= "+empName+", sal= "+sal+"]";	

	
	
	}	

}

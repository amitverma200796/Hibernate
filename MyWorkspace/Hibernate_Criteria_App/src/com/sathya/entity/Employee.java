package com.sathya.entity;

public class Employee 
{
private int empNumber;
private String empName;
private int empSal;
private int deptNumber;

public Employee()
{
	
}
public Employee(int empNumber)
{
this.empNumber=empNumber;

	
	
}
public Employee(int empnumber,String empName,int empSal,int deptNumber)
{
	this.empNumber=empNumber;
	this.empName=empName;
	this.empSal=empSal;
	this.deptNumber=deptNumber;
	
	
}
public int getEmpNumber() {
	return empNumber;
}
public void setEmpNumber(int empNumber) {
	this.empNumber = empNumber;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpSal() {
	return empSal;
}
public void setEmpSal(int empSal) {
	this.empSal = empSal;
}
public int getDeptNumber() {
	return deptNumber;
}
public void setDeptNumber(int deptNumber) {
	this.deptNumber = deptNumber;
}
public String toString()
{
return "Employee[empNumber= "+empNumber+", empName= "+empName+", empSal= "+empSal+", deptNumber= "+deptNumber+"]";	
}

}
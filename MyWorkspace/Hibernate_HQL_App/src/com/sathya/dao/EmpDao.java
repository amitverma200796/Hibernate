package com.sathya.dao;



import java.util.List;

public interface EmpDao 

{
   	void findEmpByDeptNumber(int deptno);
	 void  uploadEmpByDeptNumber(int sal,int deptno);
	
     void findEmpById(int empNumber);	

}




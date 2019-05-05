package com.sathya.test;


import java.util.Iterator;

import java.util.List;

import com.sathya.dao.EmpDaoFactory;
import com.sathya.dao.EmpDao;
import com.sathya.entity.Employee;


public class Test {

	public static void main(String[] args) 
	
	{
		EmpDao dao=EmpDaoFactory.getInstance();
	    dao.findEmpByDeptNumber(20);

		dao.uploadEmpByDeptNumber(5000,20);
		
		dao.findEmpById(7788);
		
		
	}

}

package com.sathya.test;

import com.sathya.dao.CustDao;
import com.sathya.dao.CustDaoFactory;

public class Test {

	public static void main(String[] args) {
		CustDao dao=CustDaoFactory.getInstance();
         //dao.custSaveWithLoan();
	    // dao.deleteChildRecord();
	      // dao.fetchCustomerWithLoan();
	       dao.deleteCustomerWithLoan("C-101");
	}

}


package com.sathya.test;

import com.sathya.dao.MTOdao;
import com.sathya.dao.MTOdaoFactory;

public class Test {

	public static void main(String[] args) {
		MTOdao dao=MTOdaoFactory.getInstance();
		dao.saveLoanWithCust();
		//dao.removeLoan("L_001");
		

	}

}

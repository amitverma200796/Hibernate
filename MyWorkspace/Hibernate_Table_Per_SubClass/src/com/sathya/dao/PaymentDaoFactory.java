package com.sathya.dao;

public class PaymentDaoFactory {
	private static PaymentDao dao;
	public synchronized static  PaymentDao getInstance()
	{
		if(dao==null)
		{
			dao=new PaymentImpl();
			
		}
		return dao;
		
		
	}

	
}

package com.sathya.dao;

public class CustDaoFactory {
	private static CustDao dao;
	public synchronized static  CustDao getInstance()
	{
		if(dao==null)
		{
			dao=new CustDaoImpl();
			
		}
		return dao;	
	}

	}


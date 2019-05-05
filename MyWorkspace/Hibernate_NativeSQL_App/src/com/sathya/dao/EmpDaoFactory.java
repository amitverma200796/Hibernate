package com.sathya.dao;

public class EmpDaoFactory 
{
private static EmpDao dao;
public synchronized static  EmpDao getInstance()
{
	if(dao==null)
	{
		dao=new EmpDaoImpl();
		
	}
	return dao;
	
	
}

}

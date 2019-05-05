package com.sathya.dao;



import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathay.util.HibernateUtil;



public class EmpDaoImpl implements EmpDao 
{
private SessionFactory factory;
public EmpDaoImpl()
{
	factory=HibernateUtil.getSessionFactory();
}

	public void findEmpByDeptNumber(int deptno) 
	{
		//System.out.println(dept);
		Session session=factory.openSession();
		String sql="select * from emp where deptno=?";
		SQLQuery query =session.createSQLQuery(sql);
		query.setParameter(0,deptno);
		List list=query.list();
       Iterator it= list.iterator();	
		while(it.hasNext())
		{
			    Object obj[]=(Object[])it.next();
	        	System.out.println(obj[0]);
	            System.out.println(obj[1]);  
	            System.out.println(obj[2]); 		
	            System.out.println(obj[3]);		
		}
		
       session.close();
		
		
	}


	public void InsertEmpByDeptNumber() 
	{
		Session session=factory.openSession();
		String sql="insert into emp values(?,?,?,?)";
		SQLQuery query =session.createSQLQuery(sql);
		query.setParameter(0,7695);
		query.setParameter(1,"Devid");
		query.setParameter(2,2000);
		query.setParameter(3,30);
		
		Transaction tx=session.beginTransaction();
	    int i=query.executeUpdate();
	    tx.commit();
	    session.close();
	}

}

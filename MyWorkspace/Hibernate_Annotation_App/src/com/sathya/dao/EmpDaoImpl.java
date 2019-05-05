package com.sathya.dao;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathay.util.HibernateUtil;
import com.sathya.entity.Employee;



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
		String hql="from Employee e where e.deptNumber=?";
		Query query =session.createQuery(hql);
		query.setParameter(0,deptno);
		List list=query.list();
     Iterator it= list.iterator();	
		while(it.hasNext())
		{
			Employee e=(Employee)it.next();
			System.out.println(e);
		}
       session.close();
		
		
	}


	public void uploadEmpByDeptNumber(int sal,int deptno) 
	{
		Session session=factory.openSession();
		Query query=session.createQuery("update Employee e set e.empSal=? where e.deptNumber=?");
		query.setParameter(0,sal);
		query.setParameter(1,deptno);
	    Transaction tx=session.beginTransaction();
	    int i=query.executeUpdate();
	    tx.commit();
	    session.close();
	}

}

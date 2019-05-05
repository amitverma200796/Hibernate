package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sathay.util.HibernateUtil;
import com.sathya.entity.Employee;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session1=factory.openSession();
        Session session2=factory.openSession();
		Session session3=factory.openSession();
        
		Employee e1=(Employee)session1.get(Employee.class, 7788);
		session1.close();
		try
		{
			Thread.sleep(6000);
		}
		catch(Exception e)
		{
			
		}
		Employee  e2=(Employee)session2.get(Employee.class, 7788);
		
		Employee e3=(Employee)session3.get(Employee.class,7788);
		
		
		
		
		session2.close();
		
		
		factory.close();
		
		
		
		
		
		
	}

}

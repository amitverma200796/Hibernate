package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Flight;
import com.sathya.util.HibernateUtil;

public class Test {

	public static void main(String[] args) 
	{
        SessionFactory factory=HibernateUtil.getSessionFactory();
        SessionBuilder builder=factory.withOptions();
        builder.interceptor(new MyClass());
        Session session=builder.openSession();
        Flight f=new Flight();
        f.setFlightno(37364);
        f.setSource("PUNE");
        f.setDestination("FAIZABAD");
        f.setStatus("READY");
        Transaction tx=session.beginTransaction();
        session.save(f);
        tx.commit();
        session.close();
        
	}

}

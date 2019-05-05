package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathay.util.HibernateUtil;
import com.sathya.entity.Address;
import com.sathya.entity.Employee;

public class Test {

	public static void main(String[] args) {
		 SessionFactory factory;
         factory=HibernateUtil.getSessionFactory()
        		 ;
         Session session=factory.openSession();
         Transaction tx=session.beginTransaction();
         
         Address adr=new Address("264","ameerpet","hyderabad");
         Employee e=new Employee(101,"Durgesh",adr);
         session.save(e);
         tx.commit();
         session.close();
         
	}

}

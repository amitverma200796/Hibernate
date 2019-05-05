package com.sathya.test1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sathya.entity1.Item1;

public class DeleteObject2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Configuration conf=new Configuration();
		conf.configure("com/sathya/config1/hibernate.cfg.xml");
		//step2 create service directory
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		builder.applySettings(conf.getProperties());
        ServiceRegistry registry=builder.build();
	   //step3 create a session factory
        SessionFactory factory=conf.buildSessionFactory(registry);
        //create a session
        Session session=factory.openSession();
        Item1 item=(Item1)session.get(Item1.class,101);
        System.out.println("pereviouse record"+item.toString());
        Transaction tx=session.beginTransaction();
        session.delete(item);
        tx.commit();
        session.close();
        factory.close();
	}

}

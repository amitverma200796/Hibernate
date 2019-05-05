package com.amit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.amit.entity.Product;

public class InsertObjById {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Configuration conf=new Configuration();
		conf.configure("com/amit/config/hibernate.cfg.xml");
		//step2 create service directory
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		builder.applySettings(conf.getProperties());
        ServiceRegistry registry=builder.build();
	   //step3 create a session factory
        SessionFactory factory=conf.buildSessionFactory(registry);
        //create a session
        Session session=factory.openSession();
        Product item=new Product();        
        item.setpName("VIVO");
        item.setPrice(400);
        //step 5 begin a transaction
        Transaction tx=session.beginTransaction();
        session.save(item);
        tx.commit();
        //step 6 close session
        session.close();
        //step 7 close factory
        factory.close();
	}

}
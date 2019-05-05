package com.amit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.amit.entity.Product;

public class Update_Merge_Test {

	public static void main(String[] args)
	{
		Configuration conf=new Configuration();
		conf.configure("com/amit/config/hibernate.cfg.xml");
		//step2 create service directory
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		builder.applySettings(conf.getProperties());
        ServiceRegistry registry=builder.build();
	   //step3 create a session factory
        SessionFactory factory=conf.buildSessionFactory(registry);
        //create a session
        Session session1=factory.openSession();
        Product product=(Product)session1.get(Product.class,"P001");
        session1.close();
        product.setpName("SUMSANG");
        Session session2=factory.openSession();
        Product p=(Product)session2.get(Product.class,"P001");
        Transaction tx=session2.beginTransaction();
        //session2.update(product);Demo for update
        //Demo for merge
        session2.merge(product);
        tx.commit();
        session2.close();
        factory.close();
        
        
        

	}

}

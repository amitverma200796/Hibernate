package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sathya.entity.Item;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		//step2 create service directory
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		builder.applySettings(conf.getProperties());
        ServiceRegistry registry=builder.build();
	   //step3 create a session factory
        SessionFactory factory=conf.buildSessionFactory(registry);
        //create a session
        Session session=factory.openSession();
       /*Object o=session.load(Item.class,109911);
        Item item=(Item)o;
        System.out.println(item.getItemId());
        System.out.println(item.getItemName());
        System.out.println(item.getPrice());*/
        Object o1=session.get(Item.class,109911);
        Item item=(Item)o1;
        System.out.println(item.getItemId());
        System.out.println(item.getItemName());
        System.out.println(item.getPrice());
      session.close();
	  factory.close();
	}

}

package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sathya.entity.Item;

public class HitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration conf=new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		builder.applySettings(conf.getProperties());
	    ServiceRegistry registry=builder.build();
	    SessionFactory factory=conf.buildSessionFactory(registry);
	    Session session1 =factory.openSession();
	    Session session2 =factory.openSession();
	    Object obj1=session1.get(Item.class,109911);
	    Object obj2=session1.get(Item.class,109911);
	    Object obj3=session1.get(Item.class,109912);
	    Object obj4=session2.get(Item.class,109911);
	    Object obj5=session2.get(Item.class,109912);
	    
        session1.close();
        session2.close();
        factory.close();
	
	}

}

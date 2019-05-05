package com.sathya.dao;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathay.util.HibernateUtil;
import com.sathya.entity.Passport;
import com.sathya.entity.Person;

public class OTODaoImpl implements OTODao {
	private SessionFactory factory;
	
	public OTODaoImpl()
	{
		factory=HibernateUtil.getSessionFactory();
	}
	
	@Override
	public void savePassportWithPerson() {
	
		Person person=new Person();
		person.setPid(1);
		person.setPname("Amit");
		Passport passport=new Passport();
		passport.setPassid(101);
		
        try
        {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date expDate=sdf.parse("31/12/2029");
        passport.setExpdate(expDate);
        }catch(Exception e)
        {
        	
        }
		passport.setPerson(person);
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(passport);
		tx.commit();
		session.close();
	
		
		
	}
	
}
package com.sathya.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.jdbc.LobCreator;

import com.sathya.entity.Employee;
import com.sathya.util.HibernateUtil;

public class ImageDaoImpl implements ImageDao {

	private SessionFactory factory;
	public ImageDaoImpl()
	{
		factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public void insertImage() {
	try
	{
	Session session=factory.openSession();
	Employee e=new Employee();
	e.setId(1039);
	e.setName("Amit");
	File file=new File("F:\\amit.jpg");
	long l=file.length();
	FileInputStream fis=new FileInputStream(file);
	LobCreator creator=Hibernate.getLobCreator(session);
	Blob blb=creator.createBlob(fis, l);
	e.setImage(blb);
	Transaction tx=session.beginTransaction();
	session.save(e);
	System.out.println("image inserted");
	tx.commit();
	fis.close();
	session.close();
	
	
	
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	}

	@Override
	public void selectImage() {
		try
		{
		Session session=factory.openSession();
		Employee e=(Employee)session.get(Employee.class,1039);
		Blob blb=e.getImage();
		int l=(int)blb.length();
		byte b[]=blb.getBytes(1,l);
		FileOutputStream fos=new FileOutputStream("F:\\desktop wallpaper\\test.jpg");
		fos.write(b);
		fos.close();
		session.close();
		
		
		

	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

package com.sathya.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathay.util.HibernateUtil;
import com.sathya.entity.Course;
import com.sathya.entity.Student;

public class MTODaoImpl implements MTODao {
   private SessionFactory factory;
	public MTODaoImpl()
	{
		factory=HibernateUtil.getSessionFactory();
		
	}
	
	
	@Override
	public void saveStudentWithCourse() {
		Student s1=new Student();
		s1.setId(1);
		s1.setName("amit");
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("vishal");
        
		Course c1=new Course();
        c1.setId(1091);
        c1.setName("java");
        
        Course c2=new Course();
        c2.setId(1092);
        c2.setName("oracle");
        
        Course c3=new Course();
        c3.setId(1093);
        c3.setName("php");
        
        Set <Course> set1=new HashSet<Course>();
		set1.add(c1);
		set1.add(c2);
		set1.add(c3);
		
		Set <Course> set2=new HashSet<Course>();
		set2.add(c1);
		set2.add(c2);
		
		s1.setCourse(set1);
		s2.setCourse(set2);
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(s1);
		session.save(s2);
		tx.commit();
		session.close();
		
		
		
	}
	@Override
	public void removeCourseFromStudent(int cid,int sid)
	{
		Session session=factory.openSession();
		Student s=(Student)session.get(Student.class,sid);
		Set<Course> courses=s.getCourse();
		Course course=(Course)session.get(Course.class,cid);
		Transaction tx=session.beginTransaction();
		courses.remove(course);
		tx.commit();
		session.close();
		
	
	}

}

package com.sathya.dao;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.sathay.util.HibernateUtil;
import com.sathya.entity.Employee;



public class EmpDaoImpl implements EmpDao 
{
private SessionFactory factory;
public EmpDaoImpl()
{
	factory=HibernateUtil.getSessionFactory();
}

	public void findEmpByDeptNumber(int deptno) 
	{
		//System.out.println(dept);
		Session session=factory.openSession();
		Criteria crit=session.createCriteria(Employee.class);
        Criterion c1=Restrictions.eq("deptNumber", deptno);
        crit.add(c1);
        List list=crit.list();
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
        Employee e=(Employee)itr.next();
        	System.out.println(e);
        	
        }
		
		
		session.close();
       
		
		
	}


	public void findAggregatValue()
	{
		Session session=factory.openSession();
		Criteria crit=session.createCriteria(Employee.class);
		Projection p1=Projections.rowCount();
		Projection p2=Projections.max("empSal");
		Projection p3=Projections.avg("empSal");
		ProjectionList projList=Projections.projectionList();
		projList.add(p1);
		projList.add(p2);
		projList.add(p3);
       crit.setProjection(projList);
       List list=crit.list();
       Object obj[]=(Object[])list.get(0);
       System.out.println(obj[0]);
       System.out.println(obj[1]);
       System.out.println(obj[2]);
       
		
	
		session.close();
	}

    public void findBySal(int sal)
	 {
		 Session session=factory.openSession();
			Criteria crit=session.createCriteria(Employee.class);
			Criterion c2=Restrictions.le("empSal", sal); 
			crit.add(c2);
			List list=crit.list();
			Iterator itr=list.iterator();
			while(itr.hasNext())
			{
				Employee e2=(Employee)itr.next();
				System.out.println(e2);
				
			}
			
			
			
	 }
	
	
}

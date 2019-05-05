package com.sathya.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathay.util.HibernateUtil;
import com.sathya.entity.Customer;
import com.sathya.entity.Loan;

public class CustDaoImpl implements CustDao {
	private SessionFactory factory;
	public CustDaoImpl()
	{
		factory=HibernateUtil.getSessionFactory();
	}
	@Override
	public void custSaveWithLoan() 
	{
		Session session=factory.openSession();
		Customer c1=new Customer();
		   c1.setCustId("C-101");
		   c1.setCustName("amit");
		   Loan l1=new Loan();
		   l1.setLoanId("L-901");
		   l1.setAmaount(500000);
		   Loan l2=new Loan();
		   l2.setLoanId("L-902");
		   l2.setAmaount(1000000);
		   Loan l3=new Loan();
		   l3.setLoanId("L-903");
		   l3.setAmaount(1500000);
		   List <Loan> loans=new ArrayList<Loan>();
		   loans.add(l1);
		   loans.add(l2);
		   loans.add(l3);
		   c1.setLoans(loans);
		   Transaction tx=session.beginTransaction();
		   session.save(c1);
		   tx.commit();
		   session.close();
	}
	@Override
	public void deleteChildRecord()
	{
		Session session=factory.openSession();
		Customer customer=(Customer)session.get(Customer.class,"C-101");
		Transaction tx=session.beginTransaction();
		
		List loans=customer.getLoans();
		Loan l=(Loan)session.get(Loan.class, "L-902");
		loans.remove(l);
		tx.commit();
		session.close();
		
	}
	
	
	
	
	
}




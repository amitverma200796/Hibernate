package com.sathya.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathay.util.HibernateUtil;
import com.sathya.entity.Customer;
import com.sathya.entity.Loan;

import oracle.net.aso.l;

public class MTOdaoImpl implements MTOdao {
	private SessionFactory factory;
	public MTOdaoImpl()
	{
		factory=HibernateUtil.getSessionFactory();
		
	}
	
	
	@Override
	public void saveLoanWithCust() {
		Session session=factory.openSession();
		Customer customer=new Customer();
		   customer.setCustId("C-101");
		   customer.setCustName("amit");
		
		   Loan l1=new Loan();
		   l1.setLoanId("L_001");
		   l1.setAmount(500000);
		   l1.setCustomer(customer);
		   Loan l2=new Loan();
		   l2.setLoanId("L_002");
		   l2.setAmount(1000000);
		   l2.setCustomer(customer);
		   Loan l3=new Loan();
		   l3.setLoanId("L_003");
		   l3.setAmount(1500000);
		   l3.setCustomer(customer);
		  
		   
		   Transaction tx =session.beginTransaction();
		   session.save(l1);
		   session.save(l2);
		   //session.save(l3);
		   tx.commit();
		   session.close();
		   
	}

	@Override
	public void removeLoan(String loan_id) {
		Session session=factory.openSession();
		Loan l=(Loan)session.get(Loan.class,loan_id );
   		Transaction tx=session.beginTransaction();
   		session.delete(l);
        tx.commit();
        session.close();
	}

}

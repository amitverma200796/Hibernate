package com.sathya.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathay.util.HibernateUtil;
import com.sathya.entity.Card;
import com.sathya.entity.Cheque;

public class PaymentImpl implements PaymentDao {
	private SessionFactory factory;
	public PaymentImpl()
	{
		factory=HibernateUtil.getSessionFactory();
	}

	
	@Override
	public void cardSave(Card card) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
        session.save(card);
        tx.commit();
        session.close();
	}

	@Override
	public void chequeSave(Cheque cheque) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
        session.save(cheque);
        tx.commit();
        session.close();

	}

}

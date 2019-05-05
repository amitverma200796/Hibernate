package com.sathya.test;

import java.util.Date;

import com.sathya.dao.PaymentDao;
import com.sathya.dao.PaymentDaoFactory;
import com.sathya.entity.Card;
import com.sathya.entity.Cheque;

public class Test {
	public static void main(String args[])
	{
	PaymentDao dao=PaymentDaoFactory.getInstance();
	Date d=new Date();
	Card card=new Card(101,4000,d,36363,"visa");
	dao.cardSave(card);
	Cheque cheque=new Cheque(105,3000,d,73362,"order");
	dao.chequeSave(cheque);	
	}

}

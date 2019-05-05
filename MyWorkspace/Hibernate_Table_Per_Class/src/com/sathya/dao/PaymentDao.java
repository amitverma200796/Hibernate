package com.sathya.dao;

import com.sathya.entity.Card;
import com.sathya.entity.Cheque;

public interface PaymentDao {
	void cardSave(Card card);
	void chequeSave(Cheque cheque);
	

}

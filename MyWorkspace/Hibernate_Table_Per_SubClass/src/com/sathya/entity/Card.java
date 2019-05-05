package com.sathya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue(value="card")
@PrimaryKeyJoinColumn(name="tx_id")
public class Card extends Payment {
private int cardNo;
@Column(length=10)
private String cardType;
public Card()
{
	
}
public Card(int txId,double amount,Date txDate,int cardNo,String cardType)
{
	super(txId,amount,txDate);

	this.cardNo=cardNo;
	this.cardType=cardType;
	
	
}
public int getCardNo() {
	return cardNo;
}
public void setCardNo(int cardNo) {
	this.cardNo = cardNo;
}
public String getCardType() {
	return cardType;
}
public void setCardType(String cardType) {
	this.cardType = cardType;
}


}
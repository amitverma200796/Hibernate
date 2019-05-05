package com.sathya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cheque")
public class Cheque extends Payment {
private int chqNo;
@Column(length=10)
private String chqType;
public Cheque()
{
	
}
public Cheque(int txId,double amount,Date txDate,int chqNo,String chqType)
{
	super(txId,amount,txDate);

	this.chqNo=chqNo;
	this.chqType=chqType;
	
	
}
public int getChqNo() {
	return chqNo;
}
public void setChqNo(int chqNo) {
	this.chqNo = chqNo;
}
public String getChqType() {
	return chqType;
}
public void setChqType(String chqType) {
	this.chqType = chqType;
}


}

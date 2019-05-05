package com.sathya.dao;

public interface CustDao {
	
	public void custSaveWithLoan();
	public void deleteChildRecord();
	public void fetchCustomerWithLoan();
    public void deleteCustomerWithLoan(String custId);
    public void selectWithFetch();
}

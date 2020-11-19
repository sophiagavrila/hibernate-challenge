package com.revature.dao;

import java.util.List;

import com.revature.model.BankAccount;
import com.revature.model.BankUser;

public interface Dao {

	/*
	 * CRUD Ops only
	 */
	//CREATE
	public void createUser(BankUser user);
	
	//READ
	public BankUser getBankUserById(BankUser user);
	public BankAccount getBankAccountById(BankAccount account);
	public List<BankUser> getBankUsersByUsingCriteria();
	
	//example method to test the differences between Get() and Load()
	public BankUser getBankUserByGetOrLoad(); 
	//UPDATE
	public BankUser updateVsMerge();
	//DELETE
}

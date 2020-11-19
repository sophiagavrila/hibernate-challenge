package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BANK_ACCOUNT")
public class BankAccount {
	
	@Id
	@Column(name="BA_ID")
	private int baNumber;
	
	@Column(name="BA_BALANCE")
	private double baBalance;
	
	/*
	 * 	bankUser is a foreign key to bank_user table
	 * 		we do not use @Column
	 * 	What is the relationship between BankAccount to BankUser?
	 * 		ManyToOne
	 */
	@ManyToOne
	@JoinColumn(name="U_ID")
	private BankUser bankUser;	
	/*
	 * 	2 types of fetching: Eager and Lazy
	 * 		By default, a single object is eagerly fetched
	 */
	
	public BankAccount(){
		this.baNumber=2;
	}

	public int getBaNumber() {
		return baNumber;
	}

	public void setBaNumber(int baNumber) {
		this.baNumber = baNumber;
	}

	public double getBaBalance() {
		return baBalance;
	}

	public void setBaBalance(double baBalance) {
		this.baBalance = baBalance;
	}

	public BankUser getBankUser() {
		return bankUser;
	}

	public void setBankUser(BankUser bankUser) {
		this.bankUser = bankUser;
	}

	@Override
	public String toString() {
		return "BankAccount [baNumber=" + baNumber + ", baBalance=" + baBalance + ", bankUser=" + bankUser + "]";
	}
	
}

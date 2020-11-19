package com.revature.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//JavaBean
/*
 * 	Once we have created our pojo/bean/model whatever you want to call it...
 * 		we need to map it to our table!
 * 
 * 	Can map through @'s or XML for our pojos
 * 		@ using JPA
 * 		when mapped through XML it is called hbm
 */
@Entity
@Table(name="BANK_USER")
public class BankUser implements Serializable{

	/**
	 *  JPA Annotations: Java Persistence API
	 *  	@Entity
	 *  	@Table
	 *  	@Column
	 *  	@Id
	 *  These annotations tell hibernate config it is mapped to a table
	 *  	
	 */
	private static final long serialVersionUID = -2669661945821816492L;
	
	@Id
	@SequenceGenerator(name="bank_user_seq", sequenceName="bank_user_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bank_user_seq")
	@Column(name="U_ID")
	private int userId;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column(name="FIRST_NAMES")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	public BankUser() {}

	public BankUser(int userId, String username, String password, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public BankUser(String username, String password, String firstName, String lastName) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "BankUser [userId=" + userId + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}
	
	
}

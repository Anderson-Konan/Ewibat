package com.wisdomteacher.ewibat.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PP")
public class PaypalPayment extends Payment {
	
	private String accountNumber = "unknown";
	
	
	
	// Constructor
	public PaypalPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	

}

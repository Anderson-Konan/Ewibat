package com.wisdomteacher.ewibat.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CreditCardPayment extends Payment{
	
	private String cardNumber = "unknown";
    private String expirationDate = "mm/yy";
    
    
    
    
    
	public CreditCardPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
    
    

}

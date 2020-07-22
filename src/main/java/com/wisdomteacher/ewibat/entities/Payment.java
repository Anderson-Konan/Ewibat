package com.wisdomteacher.ewibat.entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table( name = "T_Payments" )
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name="TYPE_PAYMENT", discriminatorType = DiscriminatorType.STRING )
public abstract class Payment {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPayment = 0;
    private double amount = 0;
    private Date paymentDate = new Date();
    
    //Constuctor 
    
    public Payment() {
    	super();
    	// TODO Auto-generated constructor stub
    }
    

	public int getIdPayment() {
		return idPayment;
	}


	public void setIdPayment(int idPayment) {
		this.idPayment = idPayment;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
    
	
   

}

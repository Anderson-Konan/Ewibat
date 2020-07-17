package com.wisdomteacher.ewibat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Appointment implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numApp;
	private Date date_app;
	
	private Date hour;
	private Boolean status;
	
	@ManyToOne
	private Company company;
	
	@ManyToOne
	private Person person;
	
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Long getNumApp() {
		return numApp;
	}



	public void setNumApp(Long numApp) {
		this.numApp = numApp;
	}



	public Date getDate_app() {
		return date_app;
	}


	public void setDate_app(Date date_app) {
		this.date_app = date_app;
	}


	public Date getHour() {
		return hour;
	}


	public void setHour(Date hour) {
		this.hour = hour;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	

}

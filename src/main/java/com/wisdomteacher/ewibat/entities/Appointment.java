package com.wisdomteacher.ewibat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Appointment implements Serializable{
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numApp;
	private Date date_app;
	
	private Date hour;
	private AppointmentStatus status = AppointmentStatus.blocked;
	
	@ManyToOne
	@JoinColumn(name="codeComp")
	private Entreprise company;
	
	@ManyToOne
	@JoinColumn(name = "codePerson")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name="codeLieu")
	private Lieu lieu;
	
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

	
	public AppointmentStatus getStatus() {
		return status;
	}



	public void setStatus(AppointmentStatus status) {
		this.status = status;
	}



	public Entreprise getCompany() {
		return company;
	}


	public void setCompany(Entreprise company) {
		this.company = company;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}



	public Lieu getLieu() {
		return lieu;
	}



	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
	
	
	

}

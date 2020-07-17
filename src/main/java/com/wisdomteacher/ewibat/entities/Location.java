package com.wisdomteacher.ewibat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Location implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numLocation;
	private Date dateDebut;
	private Date dateFin;
	
	@ManyToOne
	private Logement logement;
	
	@ManyToOne
	private Person person;

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getNumLocation() {
		return numLocation;
	}

	public void setNumLocation(Long numLocation) {
		this.numLocation = numLocation;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Logement getLogement() {
		return logement;
	}

	public void setLogement(Logement logement) {
		this.logement = logement;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	

	

}

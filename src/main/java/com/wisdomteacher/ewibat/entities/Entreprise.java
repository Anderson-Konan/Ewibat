package com.wisdomteacher.ewibat.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Entreprise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeComp;
	private Long numSiretComp;
	private String nameComp;
	private String descriptionComp;
	
	@OneToMany(mappedBy = "company")
	private Collection<Appointment> appointments;
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCodeComp() {
		return codeComp;
	}
	public void setCodeComp(Long codeComp) {
		this.codeComp = codeComp;
	}
	public Long getNumSiretComp() {
		return numSiretComp;
	}
	public void setNumSiretComp(Long numSiretComp) {
		this.numSiretComp = numSiretComp;
	}
	public String getNameComp() {
		return nameComp;
	}
	public void setNameComp(String nameComp) {
		this.nameComp = nameComp;
	}
	
	public String getDescriptionComp() {
		return descriptionComp;
	}
	public void setDescriptionComp(String descriptionComp) {
		this.descriptionComp = descriptionComp;
	}
	public Collection<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(Collection<Appointment> appointments) {
		this.appointments = appointments;
	}
	
	
	

}

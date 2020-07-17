package com.wisdomteacher.ewibat.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lieu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeLieu;
	private String adresse;
	private Date dateLieu;
	
	@OneToMany(mappedBy = "lieux")
	private Collection<Appointment> appointments;

	public Long getCodeLieu() {
		return codeLieu;
	}

	public void setCodeLieu(Long codeLieu) {
		this.codeLieu = codeLieu;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateLieu() {
		return dateLieu;
	}

	public void setDateLieu(Date dateLieu) {
		this.dateLieu = dateLieu;
	}

	public Collection<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(Collection<Appointment> appointments) {
		this.appointments = appointments;
	}
	
	
}

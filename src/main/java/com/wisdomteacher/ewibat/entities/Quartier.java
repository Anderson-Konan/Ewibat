package com.wisdomteacher.ewibat.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Quartier implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idQuartier;
	private String nameQuartier;
	
	@OneToMany(mappedBy = "quartier", fetch = FetchType.LAZY)
	private Collection<Logement> logements;
	
	@ManyToOne
	@JoinColumn(name="idCommune")
	private Commune commune;
	
	
	public Quartier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Long getIdQuartier() {
		return idQuartier;
	}



	public void setIdQuartier(Long idQuartier) {
		this.idQuartier = idQuartier;
	}



	public String getNameQuartier() {
		return nameQuartier;
	}



	public void setNameQuartier(String nameQuartier) {
		this.nameQuartier = nameQuartier;
	}



	public Collection<Logement> getLogements() {
		return logements;
	}



	public void setLogements(Collection<Logement> logements) {
		this.logements = logements;
	}


	public Commune getCommune() {
		return commune;
	}


	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	
	
	

}

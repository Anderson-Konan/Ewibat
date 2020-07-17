package com.wisdomteacher.ewibat.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Quartier implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_quartier;
	private String name_quartier;
	
	@OneToMany(mappedBy = "Quartier")
	private Collection<Logement> logements;
	
	
	public Quartier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getId_quartier() {
		return id_quartier;
	}
	public void setId_quartier(Long id_quartier) {
		this.id_quartier = id_quartier;
	}
	public String getName_quartier() {
		return name_quartier;
	}
	public void setName_quartier(String name_quartier) {
		this.name_quartier = name_quartier;
	}
	public Collection<Logement> getLogements() {
		return logements;
	}
	public void setLogements(Collection<Logement> logements) {
		this.logements = logements;
	}
	
	
	

}

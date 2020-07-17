package com.wisdomteacher.ewibat.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Commune {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCommune;
	
	private String nameCommune;
	
	private String distanceCommune;

	
	@OneToMany(mappedBy = "commune", fetch = FetchType.LAZY)
	private Collection<Quartier> quartiers;

	public Commune() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
	


	public Long getIdCommune() {
		return idCommune;
	}


	public void setIdCommune(Long idCommune) {
		this.idCommune = idCommune;
	}


	public String getNameCommune() {
		return nameCommune;
	}


	public void setNameCommune(String nameCommune) {
		this.nameCommune = nameCommune;
	}


	public String getDistanceCommune() {
		return distanceCommune;
	}



	public void setDistanceCommune(String distanceCommune) {
		this.distanceCommune = distanceCommune;
	}


	public Collection<Quartier> getQuartiers() {
		return quartiers;
	}


	public void setQuartiers(Collection<Quartier> quartiers) {
		this.quartiers = quartiers;
	}

	
	
	
}

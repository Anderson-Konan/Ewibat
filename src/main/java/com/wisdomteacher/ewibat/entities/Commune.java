package com.wisdomteacher.ewibat.entities;

import java.util.Collection;

public class Commune {

	private Long numLogement;
	
	private String adresse;
	
	private String superficie;
	private int loyer;
	
	private Collection<Location> locations;

	public Commune() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Long getNumLogement() {
		return numLogement;
	}

	public void setNumLogement(Long numLogement) {
		this.numLogement = numLogement;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public int getLoyer() {
		return loyer;
	}

	public void setLoyer(int loyer) {
		this.loyer = loyer;
	}

	public Collection<Location> getLocations() {
		return locations;
	}

	public void setLocations(Collection<Location> locations) {
		this.locations = locations;
	}
	
	
}

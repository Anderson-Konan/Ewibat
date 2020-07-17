package com.wisdomteacher.ewibat.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Logement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numLogement;
	
	private String adresse;
	
	private String superficie;
	private int loyer;
	
	private byte[] photos;
	
	@OneToMany(mappedBy = "logement", fetch = FetchType.LAZY)
	private Collection<Location> locations;
	
	private String description;

	public Logement() {
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

	public byte[] getPhotos() {
		return photos;
	}

	public void setPhotos(byte[] photos) {
		this.photos = photos;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	


}

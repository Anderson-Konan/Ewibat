package com.wisdomteacher.ewibat.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("maison")
public class Maison extends Logement{
	private Long nbPieces;
	public Maison() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getNbPieces() {
		return nbPieces;
	}
	public void setNbPieces(Long nbPieces) {
		this.nbPieces = nbPieces;
	}
	
	
}

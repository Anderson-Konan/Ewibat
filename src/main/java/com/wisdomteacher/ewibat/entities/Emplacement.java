package com.wisdomteacher.ewibat.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("logement")
public class Emplacement extends Logement {

	private Long numberPieces;
	
	public Emplacement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getNumberPieces() {
		return numberPieces;
	}

	public void setNumberPieces(Long numberPieces) {
		this.numberPieces = numberPieces;
	}
	
	

}

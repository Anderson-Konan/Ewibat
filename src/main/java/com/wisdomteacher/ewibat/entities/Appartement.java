package com.wisdomteacher.ewibat.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("appartement")
public class Appartement extends Logement {

	public Appartement() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

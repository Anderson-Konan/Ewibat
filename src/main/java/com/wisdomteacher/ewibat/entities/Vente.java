package com.wisdomteacher.ewibat.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("vente")
public class Vente extends Operation {

	public Vente() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

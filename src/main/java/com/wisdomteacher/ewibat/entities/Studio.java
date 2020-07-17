package com.wisdomteacher.ewibat.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("studio")
public class Studio extends Logement {

	public Studio() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}

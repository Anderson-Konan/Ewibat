package com.wisdomteacher.ewibat.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class Admin extends Person{

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}

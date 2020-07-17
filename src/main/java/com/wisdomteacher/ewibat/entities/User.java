package com.wisdomteacher.ewibat.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("user")
public class User extends Person {

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

package com.wisdomteacher.ewibat.metier;

import com.wisdomteacher.ewibat.entities.Person;

public interface PersonMetier {
	
	public Person savePerson(Person p);
	
	public Person getPerson(Long p);
	
	public Person update(Long p, Person person);
	
	public void deleteById(Person id);

}

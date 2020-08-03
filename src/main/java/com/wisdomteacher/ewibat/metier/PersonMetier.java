package com.wisdomteacher.ewibat.metier;

import java.util.List;

import com.wisdomteacher.ewibat.entities.Person;

public interface PersonMetier {
	
	public Person savePerson(Person p);
	
	public Person getPerson(Long p);
	
	public Person update(Long p, Person person);
	
	public void deleteById(Person id);
	
	public List<Person> getAllPerson();
	
	public Person getPersonByEmailId(String emailId);
	
	public Person getByEmailAndPassword(String email, String password);

}

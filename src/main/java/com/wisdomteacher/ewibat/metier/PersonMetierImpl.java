package com.wisdomteacher.ewibat.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisdomteacher.ewibat.dao.PersonRepository;
import com.wisdomteacher.ewibat.entities.Person;

@Service
public class PersonMetierImpl implements PersonMetier{
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person savePerson(Person p) {

		return personRepository.save(p);
	}

	@Override
	public Person getPerson(Long p) {
		
		return personRepository.getOne(p);

	}

	@Override
	public Person update(Long p, Person person) {
		return personRepository.save(person);
	}

	@Override
	public void deleteById(Person id) {
		personRepository.delete(id);
		
	}

	@Override
	public List<Person> getAllPerson() {	
		return personRepository.findAll();
	}

	@Override
	public Person getPersonByEmailId(String emailId) {
		return personRepository.findByEmail(emailId);
	}

	@Override
	public Person getByEmailAndPassword(String email, String password) {
		
		return personRepository.findByEmailAndPassword(email, password);
	}

}

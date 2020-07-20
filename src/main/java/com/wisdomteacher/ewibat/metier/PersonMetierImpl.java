package com.wisdomteacher.ewibat.metier;

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
	public Person getPerson(String p) {
		
		return personRepository.getOne(p);

	}

}

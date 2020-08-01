package com.wisdomteacher.ewibat.metier.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomteacher.ewibat.entities.Person;
import com.wisdomteacher.ewibat.metier.PersonMetier;

@RestController
public class PersonRestService {
	
	@Autowired
	private PersonMetier personMetier;

	


	@RequestMapping(value = "/persons", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public Person savePerson(@RequestBody Person p) {
		return personMetier.savePerson(p);
	}

	@RequestMapping(value = "/persons/{code}", method = RequestMethod.GET)
	public Person getPerson(@PathVariable Long code) {
		return personMetier.getPerson(code);
	}
	
	@RequestMapping(value = "/persons", method = RequestMethod.PUT)
	public Person update(@PathVariable Long p, @RequestBody Person person) {
		return personMetier.update(p, person);
	}

	public void deleteById(Person id) {
		personMetier.deleteById(id);
	}
	

}

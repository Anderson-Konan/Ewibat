package com.wisdomteacher.ewibat.metier.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomteacher.ewibat.entities.Person;
import com.wisdomteacher.ewibat.metier.PersonMetier;

@RestController
@CrossOrigin(origins = "*")
public class PersonRestService {
	
	@Autowired
	private PersonMetier personMetier;

	

	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public List<Person> getAllPerson() {
		return personMetier.getAllPerson();
	}

	@PostMapping(value = "/persons")
	public Person savePerson(@RequestBody Person p) throws Exception {
		String emailTemp = p.getEmail();
		if(emailTemp!=null && !"".equals(emailTemp)) {
			Person person = personMetier.getPersonByEmailId(emailTemp);
			if(person!=null)  throw new Exception("Email "+ emailTemp+ " Existe déjà");
		}
		System.out.println(emailTemp);
		Person person = null;
		person = personMetier.savePerson(p);
		return person;
	}
	
	@PostMapping("/persons/login")
	public Person loginPerson(@RequestBody Person person) throws Exception {
		String emailPerson = person.getEmail();
		 String passwordPerson = person.getPassword();
		 Person persons = null;
		 if(emailPerson!=null && passwordPerson!=null) {
			 persons = personMetier.getByEmailAndPassword(emailPerson, passwordPerson);
		 }
		 if(persons==null) throw new Exception("Failed authentification");
		 
		 return persons;
	}
	
	@GetMapping(value = "/persons/{id}")
	public Person getPerson(@PathVariable("id") Long id) {
		return personMetier.getPerson(id);
	}
	
	@RequestMapping(value = "/persons/{code}", method = RequestMethod.PUT)
	public Person update(@PathVariable Long code, @RequestBody Person person) {
		return personMetier.update(code, person);
	}

	@RequestMapping(value = "/persons/{code}", method = RequestMethod.DELETE, consumes = "application/json")
	public void deleteById(@PathVariable Person code) {
		personMetier.deleteById(code);
	}
	

}

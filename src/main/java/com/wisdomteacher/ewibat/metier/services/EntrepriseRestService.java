package com.wisdomteacher.ewibat.metier.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomteacher.ewibat.entities.Entreprise;
import com.wisdomteacher.ewibat.metier.EntrepriseMetier;

@RestController
public class EntrepriseRestService {
	
	@Autowired
	private EntrepriseMetier entrepriseMetier;
	
	@RequestMapping(value = "/entreprise", method = RequestMethod.POST)
	public Entreprise saveEntreprise(@RequestBody Entreprise e) {
		return entrepriseMetier.saveEntreprise(e);
	}

	@RequestMapping(value = "/entreprise", method = RequestMethod.GET)
	public List<Entreprise> listEntreprises() {
		return entrepriseMetier.listEntreprises();
	}
	

}

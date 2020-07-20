package com.wisdomteacher.ewibat.metier.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomteacher.ewibat.entities.Commune;
import com.wisdomteacher.ewibat.metier.CommuneMetier;

@RestController
public class CommuneRestService {
	
	@Autowired
	private CommuneMetier communeMetier;

	@RequestMapping(value = "/communes", method = RequestMethod.POST)
	public Commune saveCommune(@RequestBody Commune c) {
		return communeMetier.saveCommune(c);
	}
	
	@RequestMapping(value = "/communes", method = RequestMethod.GET)
	public List<Commune> listCommune() {
		return communeMetier.listCommune();
	}

}

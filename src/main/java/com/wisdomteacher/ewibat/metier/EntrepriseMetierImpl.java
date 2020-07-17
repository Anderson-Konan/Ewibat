package com.wisdomteacher.ewibat.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wisdomteacher.ewibat.dao.EntrepriseRepository;
import com.wisdomteacher.ewibat.entities.Entreprise;

@Component
public class EntrepriseMetierImpl implements EntrepriseMetier{
	
	@Autowired
	private EntrepriseRepository entrepriseRepository;

	@Override
	public Entreprise saveEntreprise(Entreprise e) {
		return entrepriseRepository.save(e);
	}


	@Override
	public List<Entreprise> listEntreprises() {
		return entrepriseRepository.findAll();
	}

}

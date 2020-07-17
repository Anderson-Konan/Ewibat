package com.wisdomteacher.ewibat.metier;

import java.util.List;

import com.wisdomteacher.ewibat.entities.Entreprise;


public interface EntrepriseMetier {

	public Entreprise saveEntreprise( Entreprise e);
	public List<Entreprise> listEntreprises();
}

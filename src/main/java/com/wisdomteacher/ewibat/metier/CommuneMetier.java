package com.wisdomteacher.ewibat.metier;

import java.util.List;

import com.wisdomteacher.ewibat.entities.Commune;

public interface CommuneMetier {
	
	public Commune saveCommune(Commune c);
	
	public List<Commune> listCommune();

}

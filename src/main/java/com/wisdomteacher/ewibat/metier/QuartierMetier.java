package com.wisdomteacher.ewibat.metier;

import java.util.List;

import com.wisdomteacher.ewibat.entities.Quartier;

public interface QuartierMetier {
	
	public Quartier saveQuatier(Quartier q);
	
	public List<Quartier> listQuatier();

}

package com.wisdomteacher.ewibat.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wisdomteacher.ewibat.dao.QuartierRepository;
import com.wisdomteacher.ewibat.entities.Quartier;

@Component
public class QuartierMetierImpl implements QuartierMetier{
	
	@Autowired
	private QuartierRepository quartierRepository;


	@Override
	public Quartier saveQuatier(Quartier q) {
		return quartierRepository.save(q);
	}

	@Override
	public List<Quartier> listQuatier() {
		return quartierRepository.findAll();
	}

}

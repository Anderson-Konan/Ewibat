package com.wisdomteacher.ewibat.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisdomteacher.ewibat.dao.CommuneRepository;
import com.wisdomteacher.ewibat.entities.Commune;

@Service
public class CommuneMetierImpl implements CommuneMetier{

	@Autowired
	private CommuneRepository communeRepository;
	
	@Override
	public Commune saveCommune(Commune c) {
		return communeRepository.save(c);
	}

	@Override
	public List<Commune> listCommune() {
		return communeRepository.findAll();
	}

	

}

package com.wisdomteacher.ewibat.metier.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomteacher.ewibat.entities.Quartier;
import com.wisdomteacher.ewibat.metier.QuartierMetier;

@RestController
public class QuatierRestService {
	
	@Autowired
	private QuartierMetier quartierMetier;

	@RequestMapping(value = "/quartiers", method = RequestMethod.POST)
	public Quartier saveQuatier(@RequestBody Quartier q) {
		return quartierMetier.saveQuatier(q);
	}

	@RequestMapping(value = "/quartiers", method = RequestMethod.GET)
	public List<Quartier> listQuatier() {
		return quartierMetier.listQuatier();
	};

}

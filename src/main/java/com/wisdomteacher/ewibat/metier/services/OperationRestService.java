package com.wisdomteacher.ewibat.metier.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomteacher.ewibat.entities.Operation;
import com.wisdomteacher.ewibat.metier.OperationMetier;

@RestController
public class OperationRestService {

	@Autowired
	private OperationMetier operationMetier;

	@RequestMapping(value = "/operations", method = RequestMethod.POST)
	public Operation saveOperation(@RequestBody Operation o) {
		return operationMetier.saveOperation(o);
	}

	@RequestMapping(value = "/operations/{code}", method = RequestMethod.GET)
	public Operation getOperation(@PathVariable Long code) {
		return operationMetier.getOperation(code);
	}
	
	
}

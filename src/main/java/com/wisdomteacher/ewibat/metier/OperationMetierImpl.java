package com.wisdomteacher.ewibat.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisdomteacher.ewibat.dao.OperationRepository;
import com.wisdomteacher.ewibat.entities.Operation;

@Service
public class OperationMetierImpl implements OperationMetier{

	@Autowired
	private OperationRepository operationRepository;
	
	@Override
	public Operation saveOperation(Operation o) {
		return operationRepository.save(o);
	}

	@Override
	public Operation getOperation(Long l) {
		return operationRepository.getOne(l);
		
	}

}

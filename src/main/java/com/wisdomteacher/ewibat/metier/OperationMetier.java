package com.wisdomteacher.ewibat.metier;

import com.wisdomteacher.ewibat.entities.Operation;

public interface OperationMetier {

	public Operation saveOperation(Operation o);
	
	public Operation getOperation(Long l);
}

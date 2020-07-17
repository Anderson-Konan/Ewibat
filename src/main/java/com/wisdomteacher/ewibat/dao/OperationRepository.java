package com.wisdomteacher.ewibat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisdomteacher.ewibat.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

}

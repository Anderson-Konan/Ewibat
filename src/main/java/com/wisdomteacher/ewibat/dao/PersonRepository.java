package com.wisdomteacher.ewibat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisdomteacher.ewibat.entities.Person;

public interface PersonRepository extends JpaRepository<Person, String> {

}

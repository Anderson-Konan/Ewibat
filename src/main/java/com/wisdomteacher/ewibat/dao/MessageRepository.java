package com.wisdomteacher.ewibat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisdomteacher.ewibat.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}

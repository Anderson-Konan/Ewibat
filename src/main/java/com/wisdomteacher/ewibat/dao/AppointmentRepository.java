package com.wisdomteacher.ewibat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisdomteacher.ewibat.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}

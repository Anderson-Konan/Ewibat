package com.wisdomteacher.ewibat.metier;

import java.util.List;
import java.util.Optional;

import com.wisdomteacher.ewibat.entities.Appointment;

public interface AppointmentMetier {
	
	
	
	public Appointment create(Appointment a);
	
	public Appointment update(Long appointmentId, Appointment appointment); 
	
	void deletedbyId(Long appointmentId);
	
	Optional<Appointment> findById(Long appointmentId);
	
	List<Appointment> listAppointment();
	
	public Appointment updateStatus(Appointment appointment, Long appointmentId);

}

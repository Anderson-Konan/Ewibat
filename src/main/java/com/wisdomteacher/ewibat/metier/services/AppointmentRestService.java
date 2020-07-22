package com.wisdomteacher.ewibat.metier.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wisdomteacher.ewibat.entities.Appointment;
import com.wisdomteacher.ewibat.metier.AppointmentMetier;

public class AppointmentRestService {

	@Autowired
	private AppointmentMetier appointmentMetier;

	@RequestMapping(value = "/appointments", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Appointment create(@RequestBody Appointment a) {
		return appointmentMetier.create(a);
	}

	@RequestMapping(value = "/appointments/{appointmentId}", method = RequestMethod.PUT)
	public Appointment update(@PathVariable Long appointmentId, @RequestBody Appointment appointment) {
		return appointmentMetier.update(appointmentId, appointment);
	}
	
	@RequestMapping(value = "/appointments/{appointmentId}", method = RequestMethod.DELETE)
	public void deletedbyId(@PathVariable Long appointmentId) {
		appointmentMetier.deletedbyId(appointmentId);
	}

	@RequestMapping(value = "/appointments/{appointmentId}", method = RequestMethod.GET)
	public Optional<Appointment> findById(@PathVariable Long appointmentId) {
		return appointmentMetier.findById(appointmentId);
	}

	@RequestMapping(value = "/appointments", method = RequestMethod.GET)
	public List<Appointment> listAppointment() {
		return appointmentMetier.listAppointment();
	}

	@RequestMapping(value = "/appointments/{appointmentId}", method = RequestMethod.PATCH)
	public Appointment updateStatus(@RequestBody Appointment appointment, @PathVariable Long appointmentId) {
		return appointmentMetier.updateStatus(appointment, appointmentId);
	}
}

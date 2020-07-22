package com.wisdomteacher.ewibat.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisdomteacher.ewibat.dao.AppointmentRepository;
import com.wisdomteacher.ewibat.entities.Appointment;

@Service
public class AppointmentMetierImpl implements AppointmentMetier{

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Override
	public Appointment create(Appointment a) {
		return appointmentRepository.save(a);
	}

	@Override
	public Appointment update(Long appointmentId, Appointment appointment) {
		
		return appointmentRepository.save(appointment);
	}

	@Override
	public void deletedbyId(Long appointmentId) {
		appointmentRepository.deleteById(appointmentId);
		
	}

	@Override
	public List<Appointment> listAppointment() {
		
		return appointmentRepository.findAll();
	}

	@Override
	public Optional<Appointment> findById(Long appointmentId) {
		
		return appointmentRepository.findById(appointmentId);
	}

	@Override
	public Appointment updateStatus(Appointment appointment, Long appointmentId) {
		Optional<Appointment> optionalList = appointmentRepository.findById(appointmentId);
		if(optionalList.isPresent()) {
			if(appointment.getStatus()!=null) {
				appointment.setStatus(appointment.getStatus());
			}
			return appointmentRepository.save(appointment);
		}
		return null;
	}

}

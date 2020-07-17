package com.wisdomteacher.ewibat.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_Msg")
public class Message {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numMessage;
	private String typeMessage;
	private String corpsMessage;
	
	@ManyToMany
	@JoinTable(name = "T_Msg_Person_Associations",
	joinColumns= @JoinColumn(name = "numMessage"),
	inverseJoinColumns = @JoinColumn(name="codePerson"))
	private Collection<Person> persons;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getNumMessage() {
		return numMessage;
	}

	public void setNumMessage(Long numMessage) {
		this.numMessage = numMessage;
	}

	public String getTypeMessage() {
		return typeMessage;
	}

	public void setTypeMessage(String typeMessage) {
		this.typeMessage = typeMessage;
	}

	public String getCorpsMessage() {
		return corpsMessage;
	}

	public void setCorpsMessage(String corpsMessage) {
		this.corpsMessage = corpsMessage;
	}

	public Collection<Person> getPersons() {
		return persons;
	}

	public void setPersons(Collection<Person> persons) {
		this.persons = persons;
	}
	
	
}

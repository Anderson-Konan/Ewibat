package com.wisdomteacher.ewibat.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity @Table(name = "T_Stats")
public class Statistic implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeStats;
	private String corpsStats;
	
	@ManyToMany
	@JoinTable(name = "T_Stats_Person_Associations",
	joinColumns= @JoinColumn(name = "codeStats"),
	inverseJoinColumns = @JoinColumn(name="codePerson"))
	private Collection<Person> persons;
	public Statistic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getCodeStats() {
		return codeStats;
	}

	public void setCodeStats(Long codeStats) {
		this.codeStats = codeStats;
	}

	public String getCorpsStats() {
		return corpsStats;
	}
	public void setCorpsStats(String corpsStats) {
		this.corpsStats = corpsStats;
	}

	public Collection<Person> getPersons() {
		return persons;
	}

	public void setPersons(Collection<Person> persons) {
		this.persons = persons;
	}
	
	

}

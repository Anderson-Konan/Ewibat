package com.wisdomteacher.ewibat.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity @Table(name = "T_Person")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_PERSON", discriminatorType = DiscriminatorType.STRING)


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
	@Type(name = "user", value = User.class),
	@Type(name = "admin", value = Admin.class)
})

public abstract class Person implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codePerson;
	private String firstName;
	private String lastName;
	private String email;
	private String numTel;
	private String password;
	private String profession;
	private String adresse;
	private String sexe;
	private String civilite;
	private Date age;
	private byte[] photo;
	
	@ManyToMany
	@JoinTable(name = "T_Person_Msg_Associations",
	joinColumns= @JoinColumn(name = "codePerson"),
	inverseJoinColumns = @JoinColumn(name="numMessage"))
	private Collection<Message> messages;

	@OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
	private Collection<Operation> operations;
	
	@ManyToMany
	@JoinTable(name = "T_Person_Stats_Associations",
	joinColumns= @JoinColumn(name = "codePerson"),
	inverseJoinColumns = @JoinColumn(name="codeStats"))
	
	private Collection<Statistic> statistics;
	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	


	public Long getCodePerson() {
		return codePerson;
	}

	public void setCodePerson(Long codePerson) {
		this.codePerson = codePerson;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public Date getAge() {
		return age;
	}

	public void setAge(Date age) {
		this.age = age;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	@JsonIgnore
	public Collection<Message> getMessages() {
		return messages;
	}

	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}
	
	
	public Collection<Operation> getOperations() {
		return operations;
	}
	
	
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}


	@JsonIgnore
	public Collection<Statistic> getStatistics() {
		return statistics;
	}



	public void setStatistics(Collection<Statistic> statistics) {
		this.statistics = statistics;
	}	

}

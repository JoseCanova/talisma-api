package org.nanotek.talisma.base.model.entity.person;

import java.time.LocalDate;

import org.nanotek.talisma.base.Base;
import org.nanotek.talisma.base.model.entity.client.Client;

public class Person implements Base<Long> {

	protected Long id;

	protected LocalDate birthDate;  
	
	protected LocalDate deathDate; 
	
	protected String firstName;
	
	protected String lastName; 
	
	protected String maidenName;  
	
	protected String nickName;  
	
	protected String personalHomepage;
	
	protected String personalMailbox;  
	
	protected String phoneNumber;

	private static final long serialVersionUID = 1501332631909086902L;

	public Person() {
		super();
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public LocalDate getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(LocalDate deathDate) {
		this.deathDate = deathDate;
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

	public String getMaidenName() {
		return maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPersonalHomepage() {
		return personalHomepage;
	}

	public void setPersonalHomepage(String personalHomepage) {
		this.personalHomepage = personalHomepage;
	}

	public String getPersonalMailbox() {
		return personalMailbox;
	}

	public void setPersonalMailbox(String personalMailbox) {
		this.personalMailbox = personalMailbox;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}

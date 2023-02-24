package org.nanotek.talisma.base.model.entity.person;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.nanotek.talisma.base.Base;
import org.nanotek.talisma.base.IdMutator;
import org.nanotek.talisma.base.model.entity.EntityBase;
import org.nanotek.talisma.base.model.entity.client.PersonClient;

@Entity
public class Person extends EntityBase implements Base<Long> , IdMutator<Long> {

	@Id
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

	protected Gender gender;
	
	@OneToOne(mappedBy = "person")
	protected PersonClient personClient;
	
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
	
	@Override
	public boolean equals(Object obj) {
		Integer theHash = Objects.hash(id , firstName , lastName );
		return Optional.ofNullable(obj).map (v-> theHash.equals(obj.hashCode())).orElse(false);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id , firstName , lastName );
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public PersonClient getPersonClient() {
		return personClient;
	}


	public void setPersonClient(PersonClient personClient) {
		this.personClient = personClient;
	}
	
}

package org.nanotek.talisma.base.model.entity.client;

import javax.persistence.Entity;

import org.nanotek.talisma.base.model.entity.person.Person;

@Entity
public class PersonClient extends ClientBase{

	private static final long serialVersionUID = -3308920844789408047L;

	protected Person person;
	
	public PersonClient() {
		super();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}

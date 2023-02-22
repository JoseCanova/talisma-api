package org.nanotek.talisma.base.model.entity.client;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import org.nanotek.talisma.base.Base;

@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass
public class ClientBase implements Base<Long> {

	private static final long serialVersionUID = 3528112001835616977L;
	
	protected Long id;
	
	public ClientBase() {
		super();
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

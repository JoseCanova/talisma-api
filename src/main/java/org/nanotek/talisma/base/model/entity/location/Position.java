package org.nanotek.talisma.base.model.entity.location;

import org.nanotek.talisma.base.Base;

public class Position implements Base<Long> {

	private static final long serialVersionUID = 3271007485326951018L;
	
	protected Long id;
	
	public Position() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

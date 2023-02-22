package org.nanotek.talisma.base.model.entity.location;

import org.nanotek.talisma.base.Base;

public class GeographicLocation implements Base<Long>{

	private static final long serialVersionUID = 7354014278253846959L;

	protected Long id;
	
	public GeographicLocation() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}

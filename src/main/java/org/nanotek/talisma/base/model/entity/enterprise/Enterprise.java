package org.nanotek.talisma.base.model.entity.enterprise;

import org.nanotek.talisma.base.Base;

public class Enterprise implements Base<Long>{

	private static final long serialVersionUID = 166695199329329423L;

	protected Long id;
	
	public Enterprise() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

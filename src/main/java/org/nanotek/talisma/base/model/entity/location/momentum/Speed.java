package org.nanotek.talisma.base.model.entity.location.momentum;

import org.nanotek.talisma.base.Base;

public class Speed implements Base<Long>{

	private static final long serialVersionUID = 7984966814797024930L;
	
	private Long id;
	
	private Double velocity;
	
	public Speed() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getVelocity() {
		return velocity;
	}

	public void setVelocity(Double velocity) {
		this.velocity = velocity;
	}
	
}

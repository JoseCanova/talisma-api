package org.nanotek.talisma.base.model.entity.location;

import org.nanotek.talisma.base.Base;

public class Altitude implements Base<Long>{

	private static final long serialVersionUID = 5607227434250243262L;
	
	private Long id;
	
	private Double elevation;
	
	public Altitude() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getElevation() {
		return elevation;
	}

	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}

}

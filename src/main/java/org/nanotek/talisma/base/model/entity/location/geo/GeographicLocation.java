package org.nanotek.talisma.base.model.entity.location.geo;

import org.nanotek.talisma.base.model.entity.location.Position;

public class GeographicLocation extends Position {

	private static final long serialVersionUID = 7354014278253846959L;

	protected Latitude latitude;
	
	protected Longitude longitude;
	
	public GeographicLocation() {
		super();
	}

}

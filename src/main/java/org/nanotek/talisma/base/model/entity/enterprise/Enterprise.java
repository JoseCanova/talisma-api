package org.nanotek.talisma.base.model.entity.enterprise;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.nanotek.talisma.base.Base;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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

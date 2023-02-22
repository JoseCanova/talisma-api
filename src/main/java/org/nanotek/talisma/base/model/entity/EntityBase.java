package org.nanotek.talisma.base.model.entity;

import java.util.Objects;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class EntityBase {

	public EntityBase() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		return Objects.deepEquals(this, obj);
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(this);
	}

}

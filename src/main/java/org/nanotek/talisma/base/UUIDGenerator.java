package org.nanotek.talisma.base;

import java.util.UUID;

public interface UUIDGenerator extends IdMutator<String>{

	default UUID generateUUID() {
		return UUID.randomUUID();
	}
	
	void generateId() ;
}

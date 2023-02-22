package org.nanotek.talisma.base;

public interface UrlBaseLocator {

	default String getBaseUrl(Base<?> base) {
		return "/"+base.getId();
	}
	
}

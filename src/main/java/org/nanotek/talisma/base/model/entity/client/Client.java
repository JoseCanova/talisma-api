package org.nanotek.talisma.base.model.entity.client;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.nanotek.talisma.base.Base;
import org.nanotek.talisma.base.ClientUpdateValidation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@Valid
@JsonInclude(Include.NON_NULL)
public class Client implements Base<String>{

	private static final long serialVersionUID = 8550700982126003512L;

	@NotEmpty(groups = ClientUpdateValidation.class)
	protected String id;
    
	@NotEmpty
	protected String clientId;
    
	protected String name;
    
	protected String description;
    
	protected ClientType clientType;
	
	protected Boolean enabled;
    
	public Client() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public ClientType getClientType() {
		return clientType;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}
	
}

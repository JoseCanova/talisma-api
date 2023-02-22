package org.nanotek.talisma.base.model.entity.client;

import org.nanotek.talisma.base.model.entity.enterprise.Enterprise;

public class EnterpriseClient extends ClientBase{

	private static final long serialVersionUID = 829817891027291849L;

	private Enterprise enterprise; 
	
	public EnterpriseClient() {
		super();
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

}

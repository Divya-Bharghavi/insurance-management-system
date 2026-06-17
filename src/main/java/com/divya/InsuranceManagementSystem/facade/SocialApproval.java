package com.divya.InsuranceManagementSystem.facade;

import com.divya.InsuranceManagementSystem.domain.User;
import com.divya.InsuranceManagementSystem.service.UserService;

public class SocialApproval implements SocialApprovalFacade {
	private final String username;
	public SocialApproval(String username) {
		this.username = username;
	}

	@Override
	public boolean getSocialApproval() {
		return true;
	}
}

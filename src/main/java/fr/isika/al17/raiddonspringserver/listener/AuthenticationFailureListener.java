package fr.isika.al17.raiddonspringserver.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;

import fr.isika.al17.raiddonspringserver.service.LoginAttemptService;

@Component
public class AuthenticationFailureListener {

	private LoginAttemptService loginAttemptService;

	@Autowired
	public AuthenticationFailureListener(LoginAttemptService loginAttemptService) {
		this.loginAttemptService = loginAttemptService;
	}
	
	@EventListener
	public void onAuthenticationFailure(AuthenticationFailureBadCredentialsEvent event) {
		Object principal = event.getAuthentication().getPrincipal();
		if (principal instanceof String) {
			String userName = (String) principal;
			loginAttemptService.addUserToLoginAttemptCache(userName);
		}
	}
	
}

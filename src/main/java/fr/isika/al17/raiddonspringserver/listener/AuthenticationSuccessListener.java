package fr.isika.al17.raiddonspringserver.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;

import fr.isika.al17.raiddonspringserver.models.CustomUserDetails;
import fr.isika.al17.raiddonspringserver.service.LoginAttemptService;

public class AuthenticationSuccessListener {
    
    private LoginAttemptService loginAttemptService;

	@Autowired
	public AuthenticationSuccessListener(LoginAttemptService loginAttemptService) {
		this.loginAttemptService = loginAttemptService;
	}
	
	@EventListener
	public void onAuthenticationSuccess(AuthenticationSuccessEvent event) {
		Object principal = event.getAuthentication().getPrincipal();
		if (principal instanceof CustomUserDetails) {
		    CustomUserDetails customUserDetails = (CustomUserDetails) principal;
			loginAttemptService.evictUserFromLoginAttemptCache(customUserDetails.getUsername());
		}
	}

}


package com.progrank.oauth.controllers;

import java.security.Principal;
import java.util.Map;

import org.springframework.security.oauth2.client.filter.OAuth2ClientAuthenticationProcessingFilter;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String home(Principal principal) {
		OAuth2Authentication p = (OAuth2Authentication) principal;
		Map<String, Object> user = (Map<String, Object>) p.getUserAuthentication().getDetails();
		return "Username = "+user.get("name");
		
	}

}

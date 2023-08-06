package org.jbdl53.L18_Introduction_To_Spring_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class L18IntroductionToSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(L18IntroductionToSpringSecurityApplication.class, args);
	}
	
	@GetMapping("/test")
	public String testAPI() {
		return "Test API Works";
	}
	/**
	 * http.antMatcher("/").anyReqyest.hasRole("ADMIN")
	 * http.antMatcher("/user").anyReqyest.hasRole("")
	 * 
	 */

}

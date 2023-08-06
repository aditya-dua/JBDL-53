package org.jbdl53.l19_springboot_security.L19_springboot_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class L19SpringbootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(L19SpringbootSecurityApplication.class, args);
	}
	
	@GetMapping("/home")
	public String test() {
		return "Home API works!";
	}
	
	@GetMapping("/user")
	public String user() {
		return "User API works!";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Admin API works!";
	}

}

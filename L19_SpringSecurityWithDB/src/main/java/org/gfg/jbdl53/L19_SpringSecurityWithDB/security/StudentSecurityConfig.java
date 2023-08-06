package org.gfg.jbdl53.L19_SpringSecurityWithDB.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class StudentSecurityConfig {
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests()
        .requestMatchers("/get")
        .authenticated()
        .requestMatchers("/register")
        .permitAll()
        .requestMatchers("/test")
        .permitAll()
        .requestMatchers("/getStuentRoles")
        .hasAuthority("ROLE_WRITE")
        .and()
        .httpBasic();
        return http.build();
    }
	

}

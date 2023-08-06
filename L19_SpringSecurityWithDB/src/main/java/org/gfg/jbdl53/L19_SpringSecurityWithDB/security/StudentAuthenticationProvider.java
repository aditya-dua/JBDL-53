package org.gfg.jbdl53.L19_SpringSecurityWithDB.security;

import java.util.ArrayList;
import java.util.List;

import org.gfg.jbdl53.L19_SpringSecurityWithDB.entity.Student;
import org.gfg.jbdl53.L19_SpringSecurityWithDB.repo.StudentRepo;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class StudentAuthenticationProvider implements AuthenticationProvider {
	private StudentRepo repository;

	private PasswordEncoder encoder;

	public StudentAuthenticationProvider(StudentRepo repository, PasswordEncoder encoder) {
		this.encoder = encoder;
		this.repository = repository;
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		String username = authentication.getName();
		String password = authentication.getCredentials().toString();
		
		System.out.println("In Auth");
		Student student  = repository.findByUsername(username);
		if(student == null) {
			
			throw new BadCredentialsException("Details Not Found");
		}
		
		if(encoder.matches(password, student.getPassword())) {
			System.out.println("Auth Success");
			return new UsernamePasswordAuthenticationToken(username, password,getStudentRole(student.getRole()));
		}else {
			throw new BadCredentialsException("Details Not Found");
		}
		
	}
	
	
	private List<GrantedAuthority> getStudentRole(String studentRoles){
		List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
		String[] roles = studentRoles.split(",");
		for (String role : roles) {
            
            grantedAuthorityList.add(new SimpleGrantedAuthority(role.replaceAll("\\s+", "")));
        }
		
		return grantedAuthorityList;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return false;
	}

}

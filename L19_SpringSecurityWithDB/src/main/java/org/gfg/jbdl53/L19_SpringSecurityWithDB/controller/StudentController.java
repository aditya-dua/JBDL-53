package org.gfg.jbdl53.L19_SpringSecurityWithDB.controller;

import org.gfg.jbdl53.L19_SpringSecurityWithDB.entity.Student;
import org.gfg.jbdl53.L19_SpringSecurityWithDB.service.StudentService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	
	private StudentService service;
	
	private PasswordEncoder encoder;

	public StudentController(StudentService service, PasswordEncoder encoder) {
		super();
		this.service = service;
		this.encoder = encoder;
	}
	
	@GetMapping("/test")
	public String test() {
		return "Test API works!";
	}
	
	@GetMapping("/get")
	public Student getStudent(@RequestParam("username") String username) {
		
		System.out.println("In getStuent");
		return service.getDetails(username);
	}
	
	@GetMapping("/getStuentRoles")
	public String getStudentRoles(@RequestParam("username") String username) {
		
		
		return service.getRoles(username);
	}
	
	@PostMapping("/register")
	public Student register(@RequestBody Student student) {
		
		Student stu = new Student();
		stu.setName(student.getName());
		stu.setPassword(encoder.encode(student.getPassword()));
		stu.setRole(student.getRole());
		stu.setUsername(student.getUsername());
		return service.register(stu);
	}
	
	
	
	

}

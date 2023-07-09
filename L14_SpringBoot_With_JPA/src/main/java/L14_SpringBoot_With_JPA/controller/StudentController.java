package L14_SpringBoot_With_JPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import L14_SpringBoot_With_JPA.entity.Student;
import L14_SpringBoot_With_JPA.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping("/test")
	public String test() {
		return "Test API works";
	}
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student  student) {
		
		return studentRepository.save(student);
		
	}
	
	@RequestMapping("/get/all")
	public List<Student> findAllStudent() {
		
		return studentRepository.findAll();
		
	}
	
	@RequestMapping("/get/count")
	public long findCountOfStudents() {
		
		return studentRepository.count();
		
	}
	

}

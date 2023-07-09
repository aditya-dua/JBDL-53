package L14_SpringBoot_With_JPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import L14_SpringBoot_With_JPA.entity.Student;
import L14_SpringBoot_With_JPA.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceInterface{

	@Autowired
	private StudentRepository studentRepository;
	
	
	public Student createStudent(Student  student) {
		
		return studentRepository.save(student);
		
	}
	
	public int calculatePercentage() {
		return 0;
	}
}

package org.gfg.jbdl53.L19_SpringSecurityWithDB.repo;

import org.gfg.jbdl53.L19_SpringSecurityWithDB.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	public Student findByUsername(String username);

}

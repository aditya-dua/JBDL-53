package L14_SpringBoot_With_JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import L14_SpringBoot_With_JPA.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}

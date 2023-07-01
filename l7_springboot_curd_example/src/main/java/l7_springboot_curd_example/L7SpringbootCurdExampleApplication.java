package l7_springboot_curd_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import l7_springboot_curd_example.entity.Employee;
import l7_springboot_curd_example.service.DBConnection;

@SpringBootApplication
public class L7SpringbootCurdExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(L7SpringbootCurdExampleApplication.class, args);
		
		
		Employee e= new Employee();
		
	}

}

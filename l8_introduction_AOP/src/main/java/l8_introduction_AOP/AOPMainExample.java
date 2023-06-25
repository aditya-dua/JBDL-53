package l8_introduction_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	      
	      Student student = (Student) context.getBean("student");
	      student.getName();
	      student.getAge();
	      
	      //student.printThrowException();
	}

}

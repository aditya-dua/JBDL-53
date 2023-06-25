package l8_spring_concepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		System.out.println(context);
		
		
		//testForPrototype(context);
		//testForSingleton(context);
		//testForBeanInjection(context);
		testForBeanConsInjection(context);
	}
	
	public static void testForPrototype(ApplicationContext context) {
		HelloWorld hwBean = (HelloWorld) context.getBean("helloWorld");
		System.out.println(hwBean);
		hwBean.setMessage("I am ADITYA.");
		
		HelloWorld hwBean1 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(hwBean1);
		System.out.println(hwBean1.getMessage());
	}
	
	public static void testForSingleton(ApplicationContext context) {
		HelloWorld hwBean = (HelloWorld) context.getBean("helloWorldSingleton");
		System.out.println(hwBean);
		hwBean.setMessage("I am ADITYA.");
		
		HelloWorld hwBean1 = (HelloWorld) context.getBean("helloWorldSingleton");
		System.out.println(hwBean1);
		System.out.println(hwBean1.getMessage());
	}
	
	public static void testForBeanInjection(ApplicationContext context) {
		
		Greeting greet = (Greeting) context.getBean("greetings");
		System.out.println(greet);
		System.out.println(greet.getHw());
		System.out.println(greet.getHw().getMessage());
		
		
	}
	
	public static void testForBeanConsInjection(ApplicationContext context) {
		
		HelloWorld hwBean1 = (HelloWorld) context.getBean("helloWorldSingleton");
		System.out.println(hwBean1);
		System.out.println(hwBean1.getMessage());
		hwBean1.setMessage("My First Message");
		Greeting greet = (Greeting) context.getBean("greetingsCI");
		System.out.println(greet);
		System.out.println(greet.getHw());
		System.out.println(greet.getHw().getMessage());
		
		
	}
	
	

}

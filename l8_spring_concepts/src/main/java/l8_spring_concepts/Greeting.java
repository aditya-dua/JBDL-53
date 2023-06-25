package l8_spring_concepts;

public class Greeting {
	
	private String greetMessage;
	private HelloWorld hw;
	public String getGreetMessage() {
		return greetMessage;
	}
	public void setGreetMessage(String greetMessage) {
		this.greetMessage = greetMessage;
	}
	public HelloWorld getHw() {
		return hw;
	}
	public void setHw(HelloWorld hw) {
		this.hw = hw;
	}
	public Greeting(String greetMessage, HelloWorld hw) {
		super();
		this.greetMessage = greetMessage;
		this.hw = hw;
	}
	public Greeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Greeting(HelloWorld hw) {
		super();
		this.hw = hw;
	}
	
	public Greeting(int num, String message) {
		this.greetMessage=message+" "+num;
		
	}
	

}

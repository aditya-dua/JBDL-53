
public class Student {
	
	private int id;
	private String name;
	private int age;
	// abc@gmail.com
	//ABC@gmail.com or abc@gmail.com
	private String smallName;
	
	
	// For each variable we will create 2 functions known as getters and setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		this.smallName=name.toLowerCase();
	}
	
	public void setAge(int age) {
		
		if(age<13) {
			// Throw some Error
		}
	}
	
	
	

	

}

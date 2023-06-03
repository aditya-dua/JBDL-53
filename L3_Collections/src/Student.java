
public class Student {

	int id;
	String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public String display() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

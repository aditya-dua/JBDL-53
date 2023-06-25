package l7_springboot_curd_example.model;

public class DeleteEmployeeResponse {

	private int id;
	private String message;
	private int status;
	
	public DeleteEmployeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeleteEmployeeResponse(int id, String message, int status) {
		super();
		this.id = id;
		this.message = message;
		this.status = status;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "DeleteEmployeeResponse [id=" + id + ", status=" + status + "]";
	}
	
	
}

package l7_springboot_curd_example.model;

public class CreateMultipleEmployeeRequest {

	public CreateEmployeeRequest[] empArray;

	public CreateMultipleEmployeeRequest(CreateEmployeeRequest[] empArray) {
		super();
		this.empArray = empArray;
	}

	public CreateMultipleEmployeeRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateEmployeeRequest[] getEmpArray() {
		return empArray;
	}

	public void setEmpArray(CreateEmployeeRequest[] empArray) {
		this.empArray = empArray;
	}
	
	
	
}

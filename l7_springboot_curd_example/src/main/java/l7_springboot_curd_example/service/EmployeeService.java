package l7_springboot_curd_example.service;

import l7_springboot_curd_example.model.CreateEmployeeRequest;
import l7_springboot_curd_example.model.CreateEmployeeResponse;

public interface EmployeeService {
	
	public CreateEmployeeResponse createEmployee(CreateEmployeeRequest empRequest);
	/**
	 * public List<Employee> getAllEmployees();
	 * public GetEmployeeResponse getEmployeeBasedOnId(int id);
	 * public UpdateEmployeeResponse updateEmployee(int id,UpdateEmployeeRequest empRequest);
	 * public DeleteEmployeeReponse updateEmployee(int id);
	 * public int insertMultipleEmployees(CreateMultipleEmployeeRequest empRequest)
	 */

}

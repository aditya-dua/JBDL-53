package l7_springboot_curd_example.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import l7_springboot_curd_example.entity.Employee;
import l7_springboot_curd_example.model.CreateEmployeeRequest;
import l7_springboot_curd_example.model.CreateEmployeeResponse;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	HashMap<Integer, Employee> empHM = new HashMap<>();
	Employee emp;
	
	public CreateEmployeeResponse createEmployee(CreateEmployeeRequest empRequest) {
		
		emp = new Employee(empRequest.getId(), empRequest.getName(), empRequest.getSal(), empRequest.getDepartmentName());
		
		empHM.put(emp.id, emp);
		
		CreateEmployeeResponse response = new CreateEmployeeResponse(emp.id,emp.name,emp.sal,emp.dept);
		
		return response;
		
	}
	
}

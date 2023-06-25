package l7_springboot_curd_example.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import l7_springboot_curd_example.entity.Employee;
import l7_springboot_curd_example.model.CreateEmployeeRequest;
import l7_springboot_curd_example.model.CreateEmployeeResponse;
import l7_springboot_curd_example.model.CreateMultipleEmployeeRequest;
import l7_springboot_curd_example.model.DeleteEmployeeResponse;

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

	@Override
	public DeleteEmployeeResponse deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Employee temp;
		DeleteEmployeeResponse response = new DeleteEmployeeResponse();
		if(empHM.containsKey(id)) {
			
			temp=empHM.get(id);
			empHM.remove(temp.id);
			response.setId(temp.id);
			response.setStatus(200);
			response.setMessage("Delete Success");
			
		}
		
		return response;
	}

	@Override
	public int insertMultipleEmployees(CreateMultipleEmployeeRequest empRequest) {
		// TODO Auto-generated method stub
		System.out.println(empRequest);
		
		
		return 0;
	}
	
	
}

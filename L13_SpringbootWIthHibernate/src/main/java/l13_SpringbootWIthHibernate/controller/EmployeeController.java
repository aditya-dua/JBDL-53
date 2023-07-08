package l13_SpringbootWIthHibernate.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import l13_SpringbootWIthHibernate.entity.Employee;
import l13_SpringbootWIthHibernate.model.CreateEmployeeRequestModel;
import l13_SpringbootWIthHibernate.model.CreateEmployeeResponseModel;
import l13_SpringbootWIthHibernate.model.GetEmployeeResponseModel;
import l13_SpringbootWIthHibernate.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	EmployeeService empService;
	public EmployeeController() {
		// TODO Auto-generated constructor stub
		empService = new EmployeeService();
		
	}
	
	@RequestMapping("/test")
	public String testAPI() {
		return "Test API Works";
	}
	
	@RequestMapping("/get/all")
	public List<Employee> getAllEmployees(){
		return empService.getAllEmployees();
	}
	
	@RequestMapping("/get/{id}")
	public GetEmployeeResponseModel getEmployeeById(@PathVariable int id){
		return empService.getEmployeeById(id);
	}
	
	@PostMapping("/post")
	public CreateEmployeeResponseModel createEmployee(@RequestBody CreateEmployeeRequestModel employee){
		return empService.createEmployee(employee);
	}
	
	
}

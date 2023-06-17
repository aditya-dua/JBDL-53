package l7_springboot_curd_example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import l7_springboot_curd_example.model.CreateEmployeeRequest;
import l7_springboot_curd_example.model.CreateEmployeeResponse;
import l7_springboot_curd_example.service.EmployeeServiceImpl;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeServiceImpl empService;
	
	@PostMapping("/add")
	public CreateEmployeeResponse createEmployee(@RequestBody CreateEmployeeRequest empRequest) {
		
		return empService.createEmployee(empRequest);
		
	}
	
}

package org.gfg.jbdl53.l6_intro_to_sb.controller;

import org.gfg.jbdl53.l6_intro_to_sb.entity.Employee;
import org.gfg.jbdl53.l6_intro_to_sb.model.PostEmployeeRequestModel;
import org.gfg.jbdl53.l6_intro_to_sb.model.PostEmployeeResponseModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	/**
	 * We always use GET request if our api is not excepting any body as an input.
	 * Input: Path Variable and you can Request Param
	 * POST: We typically if my api accepts a body.
	 * @return
	 */
	@RequestMapping("/")
	public String test() {
		return "Test API works!";
	}
	
	@RequestMapping("/greet/{name}")
	public String greeting(@PathVariable String name) {
		return "Hello "+name+",";
	}

	
	@RequestMapping("/greetRP")
	public String requestParamExample(@RequestParam String name) {
		return "Hello "+name+",";
	}
	
	@PostMapping("/addEmployee")
	public PostEmployeeResponseModel addEmployee(@RequestBody PostEmployeeRequestModel emp) {
		
		System.out.println(emp);
		Employee e = new Employee(emp.id, emp.name, emp.sal, emp.departmentName);
		
		// Typically we would call our which would interact with the database and then return back the result.
		
		// try catch : try is executed...status=200 and otherwise in catch or finally 400
		PostEmployeeResponseModel postResponse = new PostEmployeeResponseModel(e.id, e.name, e.sal, e.dept, 200, "Success");
		
		System.out.println(postResponse);
		
		return postResponse;
	}
	
	
}

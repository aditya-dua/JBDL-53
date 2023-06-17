package l7_springboot_curd_example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud")
public class CURDController {

	List<String> nameList = new ArrayList<>();
	
	@RequestMapping("/")
	public String test() {
		return "Test API works!";
	}
	
	@GetMapping("/load")
	public String loadNames() {
		nameList = new ArrayList<>();
		nameList.add("David");
		nameList.add("John");
		nameList.add("Ron");
		nameList.add("Vikas");
		nameList.add("Anand");
		
		return "Load Successful!";
	}
	
	@GetMapping("/add/{name}")
	public String addName(@PathVariable String name) {
		if(name==null) {
			return "PathVariable is missing";
		}
		
		nameList.add(name);
		return name+" is added successfully.";
	}
	
	@GetMapping("/add/user/{name}")
	public String addUser(@PathVariable String name) {
		if(name==null) {
			return "PathVariable is missing";
		}
		
		nameList.add(name);
		return name+" is added successfully.";
	}
	
	@GetMapping("/add")
	public String addNameUsingRequestMapping(@RequestParam String name) {
		if(name==null) {
			return "@RequestParam is missing";
		}
		
		nameList.add(name);
		return name+" is added successfully.";
	}
	
	@GetMapping("/getAllNames")
	public List<String> getAllNames(){
		if(nameList==null || nameList.isEmpty()|| nameList.size()==0) {
			loadNames();
		}
		return nameList;
	}
	
	@GetMapping("/greet/{id}")
	public String greetUser(@PathVariable int id){
		
		if(id>nameList.size()) {
			return "Hello Guest";
		}
		return "Hello "+nameList.get(id);
	}
	
}

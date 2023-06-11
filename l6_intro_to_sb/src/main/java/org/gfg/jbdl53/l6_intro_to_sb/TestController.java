package org.gfg.jbdl53.l6_intro_to_sb;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
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
}

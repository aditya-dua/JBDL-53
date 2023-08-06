package org.gfg.jbdl53.l18_SpringBootFile_ResponseEntity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public ResponseEntity<String> test(@RequestParam("year") int year){
		
		System.out.println("In Test");
		if(year>20000) {
			return new ResponseEntity<String>("Wrong Year passed",HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<String>("Success",HttpStatus.OK);
		}
		
	}


}

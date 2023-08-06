package org.gfg.jbdl53.l18_SpringBootFile_ResponseEntity.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {
	
	
	@GetMapping("/download")
	public ResponseEntity<Object> downloadFile() throws IOException{
		
		//String fileName = "/Users/adityadua/Downloads/ProjectDocumentation.pdf";
		//String fileName = "/Users/adityadua/Documents/images.jpeg";
		String fileName = "/Users/adityadua/Downloads/CRMTiger20230805.csv";
		ResponseEntity<Object> responseEntity;
		
		File file = new File(fileName);
		
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
	    headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
	    headers.add("Pragma", "no-cache");
	    headers.add("Expires", "0");
	    
	    if(true) {
	    	responseEntity = ResponseEntity.ok().contentLength(file.length()).contentType(MediaType.parseMediaType("text/plain")).body(resource);
	    }else {
	    	
	    }
		
		
		return responseEntity;
		
		
	}

}

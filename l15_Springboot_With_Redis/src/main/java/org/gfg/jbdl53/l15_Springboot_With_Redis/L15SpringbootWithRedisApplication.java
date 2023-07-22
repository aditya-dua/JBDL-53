package org.gfg.jbdl53.l15_Springboot_With_Redis;

import java.util.List;

import org.gfg.jbdl53.l15_Springboot_With_Redis.entity.Product;
import org.gfg.jbdl53.l15_Springboot_With_Redis.repo.ProductDAORepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class L15SpringbootWithRedisApplication {

	@Autowired
	private ProductDAORepo dao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(L15SpringbootWithRedisApplication.class, args);
	}
	
	@GetMapping("/")
	public List<Object> fetchallProducts(){
		System.out.println("Without Product Hash");
		return dao.getAll();
	}
	
	@PostMapping("/")
	public Product save(@RequestBody Product product) {
		return dao.save(product);
		
	}
	
	@GetMapping("/test")
	public String test(){
		return "Get All Products";
	}
}

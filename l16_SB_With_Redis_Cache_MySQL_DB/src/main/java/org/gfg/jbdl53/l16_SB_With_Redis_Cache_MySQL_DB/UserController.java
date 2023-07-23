package org.gfg.jbdl53.l16_SB_With_Redis_Cache_MySQL_DB;

import java.util.Optional;

import org.gfg.jbdl53.l16_SB_With_Redis_Cache_MySQL_DB.entity.User;
import org.gfg.jbdl53.l16_SB_With_Redis_Cache_MySQL_DB.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	private final UserRepo userRepo;
	
	
	@Autowired
	public UserController(UserRepo repo) {
		this.userRepo=repo;
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value="/load")
	public String load() {
		
		System.out.println("Repo Count::"+userRepo.count());
		User aditya = new User(1, "ADITYA", 10000);
		User john = new User(2, "JOHN", 2500);
		User rohan = new User(3, "ROHAN", 3500);
		
	
		
		userRepo.save(aditya);
		userRepo.save(john);
		userRepo.save(rohan);
		
		return ("Repo Count::"+userRepo.count());
	}
	
	
	@RequestMapping(value="/{userId}")
	@Cacheable(value="users", key="#userId", unless = "#result.followers>12000")
	public Optional<User> getUser(@PathVariable int userId) {
		return userRepo.findById(userId);
	}
	
	@CacheEvict(value="users", key="#userId")
	@DeleteMapping("/{id}")
	public String deleteUserById(@PathVariable int id) {
		userRepo.deleteById(id);
		return "Success";
	}
	
	
	
}

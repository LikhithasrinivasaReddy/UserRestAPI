package com.user.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.demo.User_entity;
import com.user.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	//get all users
	@Autowired
	UserService service;	
	
	@GetMapping("/users")
	public List<User_entity> getallUsers(){
		List<User_entity> user= service.getallUsers();
		return user;
	}
	
	@PostMapping
	public User_entity createAcoount(@RequestBody User_entity entity) {
		return service.createAcoount(entity);
		
	}
	@GetMapping("/{id}")
	public Optional<User_entity> getsingleUser(@PathVariable Integer id) {
		return service.getsingleUser(id);
	
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<User_entity> updateaUser(@PathVariable Integer id,@RequestBody User_entity user) {
		User_entity updatedUser = service.updateaUser(id, user);
		if (updatedUser != null) {
	        return ResponseEntity.ok(updatedUser);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	@DeleteMapping("/{id}")
   public boolean deleteaUser(@PathVariable Integer id) {
		
	return service.deleteaUser(id);
		 
	}

}

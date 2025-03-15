package com.user.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.user.demo.MyRepository;
import com.user.demo.User_entity;
@Service

public class UserService {
	@Autowired
	private MyRepository repo;

	public User_entity createAcoount(User_entity entity) {
		return repo.save(entity);
		
	}
	
	public List<User_entity> getallUsers(){
		
		return repo.findAll();
		
	}
	public Optional<User_entity> getsingleUser(Integer id) {
		Optional<User_entity> id2 = repo.findById(id);
		if(id2==null) {
			throw new IllegalArgumentException("Id must not be null");
		}
		return id2;
	}
	public User_entity updateaUser(Integer id,User_entity user) {
		Optional<User_entity> change = repo.findById(id);
		if(change.isPresent()){
			User_entity m = change.get();
			if (user.getName() != null) {
	            m.setName(user.getName());
	        }
	        if (user.getEmail() != null) {
	            m.setEmail(user.getEmail());
	        }
	        if (user.getAge() != null) {
	            m.setAge(user.getAge());
	        }

	        return repo.save(m);

			 
			 
		}
		else {
		 throw new NoSuchElementException("User with Id"+id+"Not found");
		}
	}
     public boolean deleteaUser(Integer id) {
		
		if(repo.existsById(id)) {
			 repo.deleteById(id);
			 return true;
		}
		return false;
	}
	
	

}

package com.app.moneyManager.mariaMoneyManager.resources;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.app.moneyManager.mariaMoneyManager.entities.User;
import com.app.moneyManager.mariaMoneyManager.repository.*;




@RestController
public class UserResource {
	
	private UserRepository repository;
	
	public UserResource ( UserRepository repository) {
		
		this.repository=repository;
	}
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return repository.findAll();
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> postUser( @RequestBody User user) {
		
		User savedUser = repository.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
		
	}
	

}

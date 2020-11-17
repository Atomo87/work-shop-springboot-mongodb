package com.leandroramos.workshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leandroramos.workshopmongo.domain.User;
import com.leandroramos.workshopmongo.service.UserService;
//recurso rest
//defino o endpoint
//equivale a @GetMapping
@RestController 
@RequestMapping(value="/users") 

public class UserResource {
	
	@Autowired
	private UserService service;
@RequestMapping(method=RequestMethod.GET) 

 //List em java é interface de ArrayList
	public ResponseEntity<List<User>> findAll(){
	   //List<User> lista = new ArrayList<>();
		//lista.addAll(Arrays.asList(maria,joana)); // inclui objetos no array
	     List<User> lista = (service.findAll());
		return ResponseEntity.ok().body(lista);	
		
	}
	
}

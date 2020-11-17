package com.leandroramos.workshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leandroramos.workshopmongo.domain.User;
//recurso rest
//defino o endpoint
//equivale a @GetMapping
@RestController 
@RequestMapping(value="/users") 
public class UserResource {
@RequestMapping(method=RequestMethod.GET) 

 //List em java é interface de ArrayList
	public List<User> findAll(){
		User maria = new User("leandro@teste.com","leandro","1");
		User joana = new User("leandro@teste1.com","leandro1","2");
				
		List<User> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(maria,joana)); // inclui objetos no array
		return lista;
		
	}
	
}

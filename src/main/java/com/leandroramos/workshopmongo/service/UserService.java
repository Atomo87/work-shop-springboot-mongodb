package com.leandroramos.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandroramos.workshopmongo.domain.User;
import com.leandroramos.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	// autorwired faz injecao de dependencia instanciando a classe a baixo
	
@Autowired
private	UserRepository repo;
	
public List<User> findAll(){
return repo.findAll();
	
}
	
	
}

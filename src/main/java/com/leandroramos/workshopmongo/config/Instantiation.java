package com.leandroramos.workshopmongo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.leandroramos.workshopmongo.repository.UserRepository;

public class Instantiation implements CommandLineRunner{
    
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		// TODO Auto-generated method stub
		
	}

}

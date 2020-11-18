package com.leandroramos.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.leandroramos.workshopmongo.domain.User;
import com.leandroramos.workshopmongo.repository.UserRepository;

public class Instantiation implements CommandLineRunner{
    
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		// TODO Auto-generated method stub
		 User maria = new User("teste@gmail.com","jose",null);
		 User joao = new User("teste1@gmail.com","joao",null);
		 User carla = new User("teste2@gmail.com","carla",null);
	     userRepository.saveAll(Arrays.asList(maria,joao,carla));
	}

}

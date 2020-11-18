package com.leandroramos.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.leandroramos.workshopmongo.domain.Post;
import com.leandroramos.workshopmongo.domain.User;
import com.leandroramos.workshopmongo.dto.AuthorDTO;
import com.leandroramos.workshopmongo.repository.PostRepository;
import com.leandroramos.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
    
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		// TODO Auto-generated method stub
		 User maria = new User("teste@gmail.com","jose",null);
		 User joao = new User("teste1@gmail.com","joao",null);
		 User carla = new User("teste2@gmail.com","carla",null);
		 //AuthorDTO dto_carla = new AuthorDTO(carla);
		// AuthorDTO dto_joao = new AuthorDTO(joao);
			userRepository.saveAll(Arrays.asList(maria,joao,carla)); //registra primeiro
		 Post post1 = new Post(null,"Partiu viagem","Seguindo para sao paulo agora",sdf.parse("25/06/2016"),new AuthorDTO(maria));
		 Post post2 = new Post(null,"Partiu praia","Seguindo para fortaleza agora",sdf.parse("9/12/2019"),new AuthorDTO(carla));
	    // userRepository.saveAll(Arrays.asList(maria,joao,carla)); // depois post
postRepository.saveAll(Arrays.asList(post1,post2));	 
maria.getLista().addAll(Arrays.asList(post1,post2));
userRepository.save(maria);
	//postRepository.saveAll(Arrays.asList(post1,post2));
	}

}

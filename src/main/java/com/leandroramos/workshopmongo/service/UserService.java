package com.leandroramos.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandroramos.workshopmongo.domain.User;
import com.leandroramos.workshopmongo.dto.UserDTO;
import com.leandroramos.workshopmongo.exception.ObjectNotFoundException;
import com.leandroramos.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	// autorwired faz injecao de dependencia instanciando a classe a baixo
	
@Autowired
private UserRepository repo;
	
public List<User> findAll(){
return repo.findAll();
	
}

public User findById(String id) {
	Optional<User> usuario = repo.findById(id);
	if(!usuario.isPresent()) {
		throw new ObjectNotFoundException("Objeto não encontrado");
	}else {
		return usuario.get();
	}
	
}

public User insert(User user) {
	return repo.insert(user);
 
	
}

public void delete(String id) {
repo.deleteById(id);
	 
}
public User update(User obj) {
	Optional<User> newObj = repo.findById(obj.getId());
	updateData(newObj,obj);
	return repo.save(newObj.get());
	
}
public void updateData(Optional<User> newObj, User user) {
	newObj.get().setEmail(user.getEmail());
	newObj.get().setNome(user.getNome());
	
	
}



public User fromDTO(UserDTO dto) {
		return new User(dto.getEmail(),dto.getNome(),dto.getId());
		
	}
	
}

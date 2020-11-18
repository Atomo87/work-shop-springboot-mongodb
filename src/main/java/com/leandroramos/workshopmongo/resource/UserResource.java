package com.leandroramos.workshopmongo.resource;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.leandroramos.workshopmongo.domain.User;
import com.leandroramos.workshopmongo.dto.UserDTO;
import com.leandroramos.workshopmongo.service.UserService;
//recurso rest
//defino o endpoint
//equivale a @GetMapping
@RestController 
@RequestMapping(value="/users") 

public class UserResource {

	 //List em java é interface de ArrayList
	//List<User> lista = new ArrayList<>();
		//lista.addAll(Arrays.asList(maria,joana)); // inclui objetos no array	
	@Autowired
	private UserService service;
	
@RequestMapping(method=RequestMethod.GET) 
public ResponseEntity<List<UserDTO>> findAll(){
  List<User> lista = service.findAll();
 List<UserDTO> listaDto = lista.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
return ResponseEntity.ok().body(listaDto);	
		
	}

@RequestMapping(value="/{id}",method=RequestMethod.GET) 
public ResponseEntity<UserDTO> findById(@PathVariable String id){
	  User usuario = service.findById(id);
    return ResponseEntity.ok().body(new UserDTO(usuario));	
			
		}
	
@RequestMapping(method=RequestMethod.POST) 
public ResponseEntity<Void>insert(@RequestBody UserDTO userDto){
	  User usuario = service.fromDTO(userDto);
	  usuario = service.insert(usuario);
	  URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri(); //retorna a uri com usuario cadastrado no header                        
    return ResponseEntity.created(uri).build();  
			
		}

@RequestMapping(value="/{id}",method=RequestMethod.DELETE) 
public ResponseEntity<Void> delete (@PathVariable String id){
	service.delete(id);
    return ResponseEntity.noContent().build();
			
		}



	
}

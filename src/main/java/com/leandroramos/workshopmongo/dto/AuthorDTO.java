package com.leandroramos.workshopmongo.dto;

import java.io.Serializable;

import com.leandroramos.workshopmongo.domain.User;

public class AuthorDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nome,id;
	public AuthorDTO() {
		
	}
	
   public AuthorDTO(User user) {
		 this.id = user.getId();
		 this.nome= user.getNome();
	}

public String getName() {
	return nome;
}

public void setName(String name) {
	this.nome = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
   
	
	
}

package com.leandroramos.workshopmongo.domain;

import java.io.Serializable;

public class User implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String nome;
private String email;
private String id;

public User(String email,String nome,String id) {
	this.email = email;
	this.nome = nome;
	this.id = id;
	
}
public User() {
	
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}



}

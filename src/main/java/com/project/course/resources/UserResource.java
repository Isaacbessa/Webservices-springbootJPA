package com.project.course.resources;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.course.entities.User;
import com.project.course.services.UserService;

//controller é uma classe responsável pela preparação de um modelo de map
@RestController
@RequestMapping(value = "/users")

public class UserResource {
@Autowired
		private UserService service;
		
//é uma anotação composta que atua como um atalho para @RequestMapping

@GetMapping 
		public ResponseEntity<List<User>> findAll() {
		List<User>list = service.findAll();
				return ResponseEntity.ok().body(list);
		}

//O método findAll retorna uma lista de entidades. Caso não exista nenhum registro na tabela, é retornada uma lista vazia ([])
@GetMapping(value = "{id}")
//criando o método
	public ResponseEntity<User> findEntity(@PathVariable long id){
	User obj = service.findById(id);
	return ResponseEntity.ok().body(obj);
 }
}

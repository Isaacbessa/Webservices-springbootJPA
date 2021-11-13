package com.project.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
// O método findAll retorna uma lista de entidades. Caso não exista nenhum registro na tabela, é retornada uma lista vazia ([])
	@GetMapping //é uma anotação composta que atua como um atalho para @RequestMapping
		public ResponseEntity<User> findAll() {
				User u = new User(1L, "Maria", "maria@gmail.com", "999999", "12345");
				return ResponseEntity.ok().body(u);
		}

}

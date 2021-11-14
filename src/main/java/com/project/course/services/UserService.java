package com.project.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.course.entities.User;
import com.project.course.repositories.UserRepository;

@Service
public class UserService {
	
		@Autowired //injetor de independencias
		private UserRepository repository;

//findALl() retorna um lista, se não existir nenhum registro retorna uma lista vazia
		public List<User> findAll() {
			return repository.findAll();
		}
		public User findById(Long id) {
		Optional<User>obj= repository.findById(id);
		return obj.get();
		}
}

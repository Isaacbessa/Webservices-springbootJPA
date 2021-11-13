package com.project.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.course.entities.User;
import com.project.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
@Autowired // injector em classes
//associando uma instância a userRepository
	private UserRepository userRepository;

@Override //Ele é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
public void run(String... args) throws Exception {
	// objetos
	User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
	User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
	
	userRepository.saveAll(Arrays.asList(u1, u2));
	//userRepository é um objeto que acessa os dados
	//saveall onde eu passo uma lista de objetos e ele salva no banco de dados
}

	
}

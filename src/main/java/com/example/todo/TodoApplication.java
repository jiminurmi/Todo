package com.example.todo;

import com.example.todo.model.Todo;
import com.example.todo.model.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.Date;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner demo(TodoRepository repository){
		return (args) ->{
			repository.save(new Todo("Testailua", "testaillaan vain", "2014-09-10 07:59:14.822"));
		};
	}*/
}

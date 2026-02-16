package com._spring_boot.spring_meven;

import com._spring_boot.spring_meven.model.User;
import com._spring_boot.spring_meven.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMevenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMevenApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(UserRepository repo) {
		return args -> {
			// seed some sample users on startup
			repo.save(new User("Alice", "alice@example.com"));
			repo.save(new User("Bob", "bob@example.com"));
		};
	}
}

package com.nuracore.trustgate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nuracore.trustgate.domain.User;
import com.nuracore.trustgate.repository.UserRepository;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class TrustGateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrustGateApplication.class, args);
	}

    @Bean
    public CommandLineRunner testDb(UserRepository userRepository) {
        return args -> {
            User user = new User();
            user.setUsername("tasin777");
            user.setEmail("tasin777@example.com");
            user.setPasswordHash("dummyhash777"); // we’ll replace this with BCrypt later
            userRepository.save(user);

            System.out.println("Inserted user: " + user.getUsername());
        };
    }


}

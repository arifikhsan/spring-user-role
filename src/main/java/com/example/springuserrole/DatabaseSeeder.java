package com.example.springuserrole;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseSeeder {
    @Bean
    CommandLineRunner run(UserRepository userRepository, RoleRepository roleRepository) {
        return args -> {
            var role = roleRepository.save(new Role("user"));
            userRepository.save(new User("user", role));
        };
    }
}

package com.green.auth.server.users;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.UUID;

@Configuration
public class UsersConfiguration {

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepository) {
        return username -> userRepository.findByUsername(username)
                .map(user -> User.withUsername(user.getUsername())
                        .password(user.getPassword())
                        .roles(user.getRoles().split(","))
                        .build())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    @Bean
    public CommandLineRunner initUsers(UserRepository repository,
                                                   PasswordEncoder passwordEncoder) {
        return args -> {
            if (repository.findByUsername("admin") == null) {
                UserEntity userEntity = new UserEntity();

                userEntity.setId(UUID.randomUUID().toString());
                userEntity.setUsername("admin");
                userEntity.setPassword(passwordEncoder.encode("admin"));
                userEntity.setRoles("USER");

                repository.save(userEntity);
            }
        };
    }

}

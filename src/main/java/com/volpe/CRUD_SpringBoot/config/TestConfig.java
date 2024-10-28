package com.volpe.CRUD_SpringBoot.config;

import com.volpe.CRUD_SpringBoot.entities.User;
import com.volpe.CRUD_SpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration // Define que esta classe é uma classe de configuração
@Profile("test") // Define que esta classe é específica para o perfil de teste
public class TestConfig implements CommandLineRunner {

    @Autowired // Injeção de dependência
    private UserRepository userRepository;

    @Override // Sobrescreve o método run
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Bruno Volpe", "bruno@email.com", "1234-1234","123321" );
        User u2 = new User(null, "Bruno Araujo", "bruno@email.com", "1234-1234","123321" );

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}

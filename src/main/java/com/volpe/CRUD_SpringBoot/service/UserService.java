package com.volpe.CRUD_SpringBoot.service;

import com.volpe.CRUD_SpringBoot.entities.User;
import com.volpe.CRUD_SpringBoot.exceptions.ResourceNotFoundException;
import com.volpe.CRUD_SpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Define que esta classe é um componente de serviço
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));
    }
}

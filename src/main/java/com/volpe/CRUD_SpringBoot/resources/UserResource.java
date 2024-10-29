package com.volpe.CRUD_SpringBoot.resources;

import com.volpe.CRUD_SpringBoot.entities.User;
import com.volpe.CRUD_SpringBoot.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Define que esta classe é um recurso web que é implementado por um controlador REST
@RequestMapping(value = "/users") // Define o caminho base para a requisição
@Resource // Define que esta classe é um componente de recurso
public class UserResource {

    @Autowired // Injeção de dependência
    private UserService service;

    @GetMapping // Indica que este método responde a uma requisição do tipo GET
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}") // Indica que este método responde a uma requisição do tipo GET
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
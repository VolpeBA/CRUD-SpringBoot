package com.volpe.CRUD_SpringBoot.repositories;

import com.volpe.CRUD_SpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Define que esta classe é um componente de repositório (Nao e necessario colocar ela, por conta do JPA ja estar fazendo a mesma coisa)
public interface UserRepository extends JpaRepository<User, Long> {
}

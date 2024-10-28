package com.volpe.CRUD_SpringBoot.repositories;

import com.volpe.CRUD_SpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

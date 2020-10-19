package com.spring.api.rest.connection.repositories;


import com.spring.api.rest.connection.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User user = new User();
    User findByName(String name);
}

package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

// Will be auto implemented by Spring into a Bean called userRepository

public interface UserRepository extends CrudRepository<User, Integer> {
}
package com.educandoweb.nelio.repositories;

import com.educandoweb.nelio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.sealth.sealthapi.repositories;

import com.sealth.sealthapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, String> {
    Optional<User> findByEmail(String email);

    Optional<User> findById(String id);
}

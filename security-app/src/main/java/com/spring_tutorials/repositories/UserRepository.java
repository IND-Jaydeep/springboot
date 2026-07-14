package com.spring_tutorials.repositories;

import com.spring_tutorials.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User , Long> {

    Optional<User> findByEmail(String email);
}

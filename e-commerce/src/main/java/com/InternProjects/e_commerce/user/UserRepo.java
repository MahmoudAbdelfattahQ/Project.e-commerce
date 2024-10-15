package com.InternProjects.e_commerce.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

   Optional<User> findByUserId(UUID id);
   void deleteUserByUserId(UUID id);
   Optional<User> findByEmail(String email);
   void removeByUserId(UUID id);

}


package com.InternProjects.e_commerce.service;

import com.InternProjects.e_commerce.model.entity.User;
import com.InternProjects.e_commerce.repositories.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl  implements UserService {

    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void updateUser(User user) {
         userRepo.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public Optional<User> getUser(int id) {
      return   userRepo.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}

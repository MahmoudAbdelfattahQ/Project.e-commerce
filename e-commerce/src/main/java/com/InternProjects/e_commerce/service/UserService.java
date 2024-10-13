package com.InternProjects.e_commerce.service;

import com.InternProjects.e_commerce.model.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    Optional<User> getUser(int id);

    List<User> getAllUsers();


}

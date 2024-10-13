package com.InternProjects.e_commerce.user;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User getUser(UUID id);

    List<User> getAllUsers();


}

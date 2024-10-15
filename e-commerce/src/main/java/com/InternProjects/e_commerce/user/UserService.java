package com.InternProjects.e_commerce.user;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    String addUser(UserDto userDto);

    String updateUser(UUID id ,UserDto userDto);

    String deleteUser(UUID id);

    User getUser(UUID id);
    User getUserByEmail(String email);

    List<User> getAllUsers();


}

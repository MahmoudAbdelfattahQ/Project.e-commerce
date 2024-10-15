package com.InternProjects.e_commerce.user;

import com.InternProjects.e_commerce.exceptions.UserIsExistException;
import com.InternProjects.e_commerce.exceptions.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.InternProjects.e_commerce.utilits.Transformations.*;

@Slf4j
@Service
public class UserServiceImpl  implements UserService {

    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Transactional
    @Override
    public String addUser(UserDto userDto) throws UserIsExistException {

        userRepo.findByEmail(userDto.getEmail())
                .ifPresent(  user -> {
                    throw new UserIsExistException("User with email " + user.getEmail() + " is already exist");
                });

        userRepo.save(transformToUser(userDto));
        log.info("User {} added successfully", userDto.getUserName());

        return "User " + userDto.getUserName() + " is added successfully ";

    }

    @Transactional
    @Override
    public String updateUser(UUID id ,UserDto userDto)  throws UserNotFoundException{
        User userExist = userRepo.findByUserId(id).orElseThrow(
                () -> new UserNotFoundException("This user doesn't exist"));

        userExist.setUserName(userDto.getUserName());
        userExist.setLName(userDto.getLName());
        userExist.setFName(userDto.getFName());
        userExist.setEmail(userDto.getEmail());
        userExist.setRole(userDto.getRole());
        userExist.setPassword(userDto.getPassword());
        userExist.setDateJoined(userDto.getDateJoined());

      userRepo.save(userExist);
         log.info("User {} updated successfully", userDto.getUserName());
         return "User "+userExist.getUserName() +" updated successfully";

    }

    @Transactional
    @Override
    public String deleteUser(UUID id) throws UserNotFoundException {

        Optional<User> userOptional = userRepo.findByUserId(id);

        if (userOptional.isPresent()) {
            userRepo.deleteUserByUserId(id);
            log.info("Deleted user {}", id);
            return "Deleted user with id {" +id + "}";
        } else {
            log.error("This user {} does not exist", id);
            throw new UserNotFoundException();
        }


    }

    @Override
    public User getUser(UUID id)  throws UserNotFoundException  {
      User user =   userRepo.findByUserId(id).orElseThrow(
              () -> new UserNotFoundException("This user does not exist"));
      log.info("User {} found using getUser method", user.getUserName());
      return user;
    }

    @Override
    public User getUserByEmail(String email)  throws UserNotFoundException  {
        User user =   userRepo.findByEmail(email).orElseThrow(
                () -> new UserNotFoundException("This user does not exist"));
        log.info("User with email {} found using getUser method", user.getEmail());
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        log.info("Get All user method for listed all users ");
        return userRepo.findAll();

    }
}

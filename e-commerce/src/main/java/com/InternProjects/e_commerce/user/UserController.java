package com.InternProjects.e_commerce.user;

import com.InternProjects.e_commerce.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user/")
public class UserController  {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile/add")
    public ResponseEntity<String> addUser(@RequestBody UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(userDto));
    }

    @GetMapping("/profile/{id}")
    public User getUser(@PathVariable UUID id) {
        return  userService.getUser(id);
    }

    @PostMapping("profile/{email}")
    public User getUser(@PathVariable String email) {
        return  userService.getUserByEmail(email);
    }



    @PutMapping("/profile/{id}")
    public ResponseEntity<String> updateUser(@PathVariable UUID id ,@RequestBody UserDto userDto) {
       String msg = userService.updateUser(id ,userDto);
        return ResponseEntity.ok(msg);

    }

    @DeleteMapping("/profile/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable UUID id) {

        return ResponseEntity.ok(userService.deleteUser(id));
    }




}

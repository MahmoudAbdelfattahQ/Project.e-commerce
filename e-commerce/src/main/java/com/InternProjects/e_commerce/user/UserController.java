package com.InternProjects.e_commerce.user;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "*", methods =
        {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

@RestController
@RequestMapping("/user")
public class UserController  {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("profile/add")
    public ResponseEntity<String> addUser(@RequestBody UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(userDto));
    }

    @GetMapping("get/{id}")
    public User getUserByID(@PathVariable UUID id) {
        return  userService.getUser(id);
    }

    @GetMapping("getUserByEmail/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return  userService.getUserByEmail(email);
    }


    @PutMapping("update/{id}")
    public ResponseEntity<String> updateUser(@PathVariable UUID id ,@RequestBody UserDto userDto) {
       String msg = userService.updateUser(id ,userDto);
        return ResponseEntity.ok(msg);

    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable UUID id) {
            return ResponseEntity.ok(userService.deleteUser(id));
    }

    @GetMapping("getAll")
    public List<User> getAllUSer(){
        return userService.getAllUsers();
    }

}

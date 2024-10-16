package com.InternProjects.e_commerce.user;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
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

    @PostMapping ("add")
    public ResponseEntity<String> addUser(@Validated @RequestBody UserDto userDto , BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(userDto));
    }

    @GetMapping("get/{id}")
    public User getUserByID(@PathVariable UUID id) {
        return  userService.getUser(id);
    }

    @GetMapping("getUserByEmail/{email}")
    public User getUserByEmail(@Validated @PathVariable String email) {
        return  userService.getUserByEmail(email);
    }


    @PutMapping("update/{id}")
    public ResponseEntity<String> updateUser(@PathVariable UUID id ,@Validated @RequestBody UserDto userDto , BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
        }

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

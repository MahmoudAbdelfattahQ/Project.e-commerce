package com.InternProjects.e_commerce.utilits;

import com.InternProjects.e_commerce.user.User;
import com.InternProjects.e_commerce.user.UserDto;


import java.util.UUID;
public class Transformations {


   // private static final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

   private Transformations(){
   }

//    private static String encodePassword(String rawPassword) {
//        return bCryptPasswordEncoder.encode(rawPassword);
//    }
    public static UserDto transformToDto(User user) {
     return    UserDto.builder()
                .userName(user.getUserName())
                .fName(user.getFName())
                .lName(user.getLName())
                .email(user.getEmail())
                .role(user.getRole())
                .DateJoined(user.getDateJoined())
                .password(user.getPassword())
                .build();
    }

    public static User transformToUser(UserDto userDto) {
        return User.builder()
                .userId(UUID.randomUUID())
                .userName(userDto.getUserName())
                .fName(userDto.getFName())
                .lName(userDto.getLName())
                .email(userDto.getEmail())
                .role(userDto.getRole())
                .DateJoined(userDto.getDateJoined())
                .password(userDto.getPassword())
                .build();
    }

}

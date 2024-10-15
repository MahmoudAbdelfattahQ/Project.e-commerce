package com.InternProjects.e_commerce.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String userName;
    private String fName;
    private String lName;
    private String password;
    private String email;
    private String role;
    private Timestamp DateJoined;
    private Timestamp lastDateJoined;
}

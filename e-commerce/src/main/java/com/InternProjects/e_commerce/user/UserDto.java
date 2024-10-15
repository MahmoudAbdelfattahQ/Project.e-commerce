package com.InternProjects.e_commerce.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @NotNull(message = "User name is required")
    @Size(min = 5, max = 50 ,message = "User Name must be at least 5")
    private String userName;
    @NotNull(message = "Required")
    private String fName;
    @NotNull(message = "Required")
    private String lName;
    @NotBlank(message = "Password is required")
    @Size(min = 5, max = 50 , message = "Password must be contain at least 5 char!")
    private String password;
    @Email(message = "Invalid email !")
    @NotBlank(message = "Email is required")
    private String email;
    @NotBlank
    private String role;
    private Timestamp DateJoined;
    private Timestamp lastDateJoined;
}

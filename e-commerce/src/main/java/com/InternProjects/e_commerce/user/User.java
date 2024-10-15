package com.InternProjects.e_commerce.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;

    @Column(name = "Username", unique = true, nullable = false)
    private String userName;

    @Column(name = "First_Name", nullable = false)
    private String fName;

    @Column(name = "Last_Name", nullable = false)
    private String lName;

    @Column(name = "Password", nullable = false)
    private String password;


    @Column(name = "Email" ,unique = true ,nullable = false)
    private String email;

    @Column(name = "Role",nullable = false)
    private String role;

    @Column(name = "Date_Joined")
    private Timestamp DateJoined;

    @Column (name = "Last_Login")
    private Timestamp lastDateJoined;

}

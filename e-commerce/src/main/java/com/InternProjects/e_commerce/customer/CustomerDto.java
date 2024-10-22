package com.InternProjects.e_commerce.customer;

import com.InternProjects.e_commerce.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private String customerPhone;
    private String customerAddress;
    private User user;
}

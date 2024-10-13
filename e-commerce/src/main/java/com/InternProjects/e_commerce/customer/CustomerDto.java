package com.InternProjects.e_commerce.customer;

import com.InternProjects.e_commerce.user.User;
import lombok.Data;

@Data
public class CustomerDto {

    private String customerPhone;
    private String customerAddress;
    private User user;
}

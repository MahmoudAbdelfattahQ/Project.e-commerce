package com.InternProjects.e_commerce.model.dto;

import com.InternProjects.e_commerce.model.entity.Users;
import lombok.Data;

@Data
public class CustomersDto {

    private String customerPhone;
    private String customerAddress;
    private Users user;
}

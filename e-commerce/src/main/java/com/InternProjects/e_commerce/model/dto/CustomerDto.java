package com.InternProjects.e_commerce.model.dto;

import com.InternProjects.e_commerce.model.entity.User;
import lombok.Data;

@Data
public class CustomerDto {

    private String customerPhone;
    private String customerAddress;
    private User user;
}

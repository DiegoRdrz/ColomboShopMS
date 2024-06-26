package com.ColomboShop.MS_Users.DTO;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class UserDTO {
    private String name;
    private Date age;
    private String email;
    private String password;
    private String role;
    private String address;
    private Map<String, Object> paymentMethods;
    private Map<String, Object> paymentReceiptMethod;
}
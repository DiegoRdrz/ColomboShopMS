package com.ColomboShop.MS_Users.Service;


import com.ColomboShop.MS_Users.DTO.UserDTO;
import com.ColomboShop.MS_Users.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(UserDTO userDTO);
    Optional<User> getUserById(String id);
    List<User> getAllUsers();
    User updateUser(String id, UserDTO userDTO);
    void deleteUser(String id);
}



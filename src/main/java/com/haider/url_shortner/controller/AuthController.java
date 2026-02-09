package com.haider.url_shortner.controller;

import com.haider.url_shortner.dto.UserDto;
import com.haider.url_shortner.entity.UserEntity;
import com.haider.url_shortner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserDto registerUser(@RequestBody UserEntity userEntity) {
        return userService.addUser(userEntity);
    }

    @PostMapping("/login")
    public UserDto loginUser(@RequestBody UserEntity userEntity) {
        return userService.getUserByUsername(userEntity.getUsername());
    }
}

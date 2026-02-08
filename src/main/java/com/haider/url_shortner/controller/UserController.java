package com.haider.url_shortner.controller;

import com.haider.url_shortner.dto.UserDto;
import com.haider.url_shortner.entity.UserEntity;
import com.haider.url_shortner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public UserDto createUser(@RequestBody UserEntity userEntity) {
        return userService.addUser(userEntity);
    }

    @GetMapping("user/{username}")
    public UserDto getUser(@PathVariable String username){
        return userService.getUserByUsername(username);
    }
}

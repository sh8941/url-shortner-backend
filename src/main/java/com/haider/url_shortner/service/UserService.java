package com.haider.url_shortner.service;


import com.haider.url_shortner.dto.UserDto;
import com.haider.url_shortner.entity.UserEntity;
import com.haider.url_shortner.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public UserDto getUserByUsername(String username){
        Optional<UserEntity> userOptional = userRepo.findByUsername(username);
        if (userOptional.isPresent()){
            UserEntity userEntity = userOptional.get();
            return new UserDto(userEntity.getId(),
                    userEntity.getUsername(),
                    userEntity.getRole());
        }else {
            throw new RuntimeException("Username not found");
        }
    }

    public UserDto addUser(UserEntity userEntity) {
        UserEntity user = userRepo.save(userEntity);
        return new UserDto(user.getId(),
                user.getUsername(),
                user.getRole());
    }
}

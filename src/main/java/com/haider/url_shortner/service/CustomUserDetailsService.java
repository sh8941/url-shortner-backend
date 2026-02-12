package com.haider.url_shortner.service;

import com.haider.url_shortner.entity.UserEntity;
import com.haider.url_shortner.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       UserEntity userEntity = userRepo.findByUsername(username).orElseThrow(() ->
               new UsernameNotFoundException("username not found : "+username));
       return new User(userEntity.getUsername(),
               userEntity.getPassword(),
               List.of(new SimpleGrantedAuthority("ROLE_USER")));
    }
}

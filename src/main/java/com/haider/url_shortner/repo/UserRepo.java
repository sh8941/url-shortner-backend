package com.haider.url_shortner.repo;

import com.haider.url_shortner.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,Long> {
    public Optional<UserEntity> findByUsername(String username);
    public UserEntity save(UserEntity userEntity);
}

package com.haider.url_shortner.repo;

import com.haider.url_shortner.entity.UrlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UrlRepo extends JpaRepository<UrlEntity, Long> {
    UrlEntity save(UrlEntity urlEntity);
    List<UrlEntity> findAllByUserId(Long userId);

    Optional<UrlEntity> findByShortCode(String shortUrl);
}

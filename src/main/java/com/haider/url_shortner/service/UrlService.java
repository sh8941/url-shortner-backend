package com.haider.url_shortner.service;

import com.haider.url_shortner.entity.UrlEntity;
import com.haider.url_shortner.repo.UrlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
    @Autowired
    private UrlRepo urlRepo;

    public void addUrl(UrlEntity urlEntity) {
        long id = urlRepo.save(urlEntity).getId();
        String shortCode = Base62Encoder.encode(id);
        urlEntity.setShortCode(shortCode);
        urlRepo.save(urlEntity);
    }

    public String getUrl(String shortUrl) {
        UrlEntity urlEntity = urlRepo.findByShortCode(shortUrl)
                .orElseThrow(() -> new RuntimeException("url not found..."));
        return urlEntity.getLongUrl();
    }

}

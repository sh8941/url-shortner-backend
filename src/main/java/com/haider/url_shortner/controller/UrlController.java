package com.haider.url_shortner.controller;

import com.haider.url_shortner.entity.UrlEntity;
import com.haider.url_shortner.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("api/url")
public class UrlController {
    @Autowired
    private UrlService urlService;

    @PostMapping
    public ResponseEntity<Void> addUrl(@RequestBody UrlEntity urlEntity) {
        urlService.addUrl(urlEntity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

   @GetMapping("/{shortUrl}")
   public ResponseEntity<Void> getLongUrl(@PathVariable String shortUrl) {
        String longUrl = urlService.getUrl(shortUrl);
        return ResponseEntity
                .status(HttpStatus.FOUND)
                .location(URI.create(longUrl))
                .build();
   }

}

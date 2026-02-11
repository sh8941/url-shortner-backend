package com.haider.url_shortner.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "url_table")
public class UrlEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String shortCode;

    @Column(nullable = false)
    private String longUrl;

    @ManyToOne(optional = false ,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = true)
    private UserEntity createdBy;

    private LocalDateTime createdAt = LocalDateTime.now();

    public UrlEntity() {
    }

    public UrlEntity(Long id, String shortCode, String longUrl, UserEntity createdBy, LocalDateTime createdAt) {
        this.id = id;
        this.shortCode = shortCode;
        this.longUrl = longUrl;
        this.createdBy = createdBy;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }


    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = LocalDateTime.now();
    }
}

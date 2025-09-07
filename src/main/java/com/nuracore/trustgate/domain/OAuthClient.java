package com.nuracore.trustgate.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "oauth_clients")
public class OAuthClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String clientId;

    @Column(nullable = false)
    private String clientSecret;

    private String name;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String redirectUris; // comma-separated or JSON

    @Column(nullable = false, columnDefinition = "TEXT")
    private String scopes; // comma-separated

    @Column(nullable = false, columnDefinition = "TEXT")
    private String grantTypes; // comma-separated

    private Integer accessTokenTtl = 3600; // seconds
    private Integer refreshTokenTtl = 2592000; // seconds

    private LocalDateTime createdAt = LocalDateTime.now();

    // getters and setters
}
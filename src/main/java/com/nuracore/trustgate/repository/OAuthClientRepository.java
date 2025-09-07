package com.nuracore.trustgate.repository;

import com.nuracore.trustgate.domain.OAuthClient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface OAuthClientRepository extends JpaRepository<OAuthClient, Long> {
    Optional<OAuthClient> findByClientId(String clientId);
}
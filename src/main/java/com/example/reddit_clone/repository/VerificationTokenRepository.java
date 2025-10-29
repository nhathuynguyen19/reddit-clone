package com.example.reddit_clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reddit_clone.model.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long>{

}

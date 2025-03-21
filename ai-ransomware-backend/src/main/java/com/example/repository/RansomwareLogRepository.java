package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.RansomwareLog; // Importing model class

@Repository
public interface RansomwareLogRepository extends JpaRepository<RansomwareLog, Long> {
}

package com.example.projectemarketg3.entity.repository.other;

import com.example.projectemarketg3.entity.Off;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffRepository extends JpaRepository<Off, Long> {
}
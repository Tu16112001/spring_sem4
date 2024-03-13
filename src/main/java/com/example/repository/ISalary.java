package com.example.repository;

import com.example.entities.ManageSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ISalary extends JpaRepository<ManageSalary, Integer> {
    Optional<ManageSalary> findByNameContainingOrAgeContaining(String search);
}

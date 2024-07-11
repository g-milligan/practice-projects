package com.practice.sills.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.sills.entity.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    
}

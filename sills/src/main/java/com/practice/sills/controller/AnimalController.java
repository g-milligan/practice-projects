package com.practice.sills.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.sills.entity.Animal;
import com.practice.sills.exception.BadRequestException;
import com.practice.sills.exception.ResourceNotFoundException;
import com.practice.sills.repo.AnimalRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalRepository repository;

    @GetMapping
    public List<Animal> getAll() {
        log.info("TEST GET ALL ANIMALS");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Animal getAll(@PathVariable Long id) throws ResourceNotFoundException {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("animal not found"));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Animal> create(@RequestBody List<Animal> animals) throws BadRequestException {
        return repository.saveAll(animals);
    }

    @PutMapping("/{id}")
    public Animal update(@PathVariable Long id, @RequestBody Animal updateAnimal) {
        Animal existingAnimal = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Animal not found"));
        existingAnimal.setName(updateAnimal.getName());
        return repository.save(existingAnimal);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Animal not found"));
        repository.deleteById(id);
    }
}

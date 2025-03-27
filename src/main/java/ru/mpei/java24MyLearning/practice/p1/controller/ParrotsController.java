package ru.mpei.java24MyLearning.practice.p1.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mpei.java24MyLearning.practice.p1.model.Color;
import ru.mpei.java24MyLearning.practice.p1.model.Parrot;
import ru.mpei.java24MyLearning.practice.p1.repo.InMemoryParrotRepo;
import ru.mpei.java24MyLearning.practice.p1.repo.ParrotRepo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
public class ParrotsController {

    @Autowired
    private InMemoryParrotRepo parrotRepo;
    @Autowired
    private ParrotRepo parrotRepo2;


    @PostMapping("/saveParrotToLocal")
    public void saveParrot(@RequestBody Parrot parrot) {
        parrotRepo.saveParrot(parrot);
    }

    @PostMapping("/saveAllParrotsToLocal")
    public void saveParrots(@RequestBody Collection<Parrot> parrots) {
        parrotRepo.saveParrots(parrots);
    }

    @GetMapping("/getParrotByColorToLocal")
    public Collection<Parrot> getParrotsByColor(@RequestParam("color") String color) {
        Optional<List<Parrot>> parrotsByColor = parrotRepo.getParrotsByColor(Color.getColorFromString(color));
        return parrotsByColor.orElseGet(ArrayList::new);
    }






}

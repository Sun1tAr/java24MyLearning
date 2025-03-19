package ru.mpei.java24MyLearning.practice.p1.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
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
@RequestMapping("/parrot")
public class ParrotsController {

    @Autowired
    private InMemoryParrotRepo parrotRepo;
    @Autowired
    private ParrotRepo parrotRepo2;
    @Autowired
    private ObjectMapper mapper;

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

    @PostMapping("/save")
    public void postParrot(@RequestBody Parrot parrot) {
        parrotRepo2.addParrot(parrot);
    }

    @PutMapping("/put")
    public void putParrot(@RequestBody Parrot parrot) {
        parrotRepo2.updateParrot(parrot);
    }

    @DeleteMapping("/deleteById:{id}")
    public void deleteParrot(@PathVariable int id) {
        parrotRepo2.deleteParrotById(id);
    }

    @GetMapping("/get")
    public Parrot getParrot(@RequestParam("id") int id) {
        return parrotRepo2.getParrotById(id);
    }




}

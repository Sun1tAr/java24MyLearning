package ru.mpei.java24MyLearning.theory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mpei.java24MyLearning.theory.model.Measurement;
import ru.mpei.java24MyLearning.theory.repo.InMemoryRepository;

@RestController
public class MeasurementsDataController {

    @Autowired
    private InMemoryRepository repo;

    @PostMapping("/save")
    public void safeMeasurement(@RequestBody Measurement measurement) {
        repo.save(measurement);
    }

    @GetMapping("/get")
    public Measurement getMeasurement(@RequestParam String measurementid) {
//    public Measurement getMeasurement(@RequestParam("measurementid") String id) {
        return repo.get(measurementid);
    }

}

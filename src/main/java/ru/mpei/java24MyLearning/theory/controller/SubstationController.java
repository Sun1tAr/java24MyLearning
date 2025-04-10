package ru.mpei.java24MyLearning.theory.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mpei.java24MyLearning.theory.model.Substation;
import ru.mpei.java24MyLearning.theory.repo.SubstationsRepo;

@RestController
@RequestMapping("/substations")
public class SubstationController {

    @Autowired
    private SubstationsRepo repo;

    @GetMapping("/get/{idint}")
    public Substation get(@PathVariable(name = "idint") int id) {
        return repo.getById(id);
    }

    @GetMapping("/get")
    public Substation get2(@RequestParam(name = "id") int id) {
        return repo.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Substation substation) {
        repo.save(substation);
    }

//    @PostConstruct
    public void init() {
        Substation substation = new Substation();
        substation.setVoltageclass(110);
        substation.setName("Murzilko");
        repo.save(substation);

        substation = new Substation();
        substation.setVoltageclass(220);
        substation.setName("Purino");
        repo.save(substation);

        substation = new Substation();
        substation.setVoltageclass(500);
        substation.setName("Wuffel");
        repo.save(substation);
    }


}

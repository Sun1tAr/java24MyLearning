package ru.mpei.java24MyLearning.theory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mpei.java24MyLearning.theory.model.Substation;
import ru.mpei.java24MyLearning.theory.repo.SubstationsRepo;

@RestController
public class SubstationController {

    @Autowired
    private SubstationsRepo repo;

    @GetMapping("substations/get/{idint}")
    public Substation get(@PathVariable(name = "idint") int id) {
        return repo.getById(id);
    }

    @GetMapping("substations/get")
    public Substation get2(@RequestParam(name = "id") int id) {
        return repo.getById(id);
    }


}

package ru.mpei.java24MyLearning.theory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mpei.java24MyLearning.theory.model.Equipment;
import ru.mpei.java24MyLearning.theory.repo.EquipmentRepo;

@RestController
public class EquipmentController {

    @Autowired
    private EquipmentRepo repo;

    @GetMapping("equipment/get/{id}")
    public Equipment get(@PathVariable int id) {
        return repo.getById(id);
    }

    @GetMapping("equipment/get")
    public Equipment get2(@RequestParam(name = "id") int id) {
        Equipment equipment = repo.getById(id);
        return equipment;
    }

    @GetMapping("equipment")
    public Equipment get3() {
        Equipment equipment = repo.getById(2);
        return equipment;
    }

}

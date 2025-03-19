package ru.mpei.java24MyLearning.theory.repo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import ru.mpei.java24MyLearning.theory.model.Equipment;

@Repository
public class EquipmentRepo {

    @PersistenceContext
    private EntityManager em;


    public Equipment getById(int id) {
        Equipment equipment = em.find(Equipment.class, id);
        return equipment;
    }

    public void add(Equipment equipment) {
        em.persist(equipment);
    }
}

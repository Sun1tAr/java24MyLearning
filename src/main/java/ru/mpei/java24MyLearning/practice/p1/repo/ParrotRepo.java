package ru.mpei.java24MyLearning.practice.p1.repo;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.mpei.java24MyLearning.practice.p1.model.Color;
import ru.mpei.java24MyLearning.practice.p1.model.Parrot;

@Repository
public class ParrotRepo {

    @PersistenceContext
    EntityManager entityManager;

    @PostConstruct
    private void createParrots(Parrot parrot) {
        String name = "Питух - ";
        Parrot p = new Parrot();
        for (int i = 1; i < 8; i++) {
            p.setName(name + i);
            p.setColor(Color.getRandomColor());
            p.setAge(i);
            entityManager.merge(p);
        }
    }

    public Parrot getParrotById(int id) {
        return entityManager.find(Parrot.class, id);
    }

    public void updateParrot(Parrot parrot) {
        entityManager.merge(parrot);
    }

    public void deleteParrotById(int id) {
        Parrot parrot = entityManager.find(Parrot.class, id);
        entityManager.remove(parrot);
    }

    public void addParrot(Parrot parrot) {
        entityManager.persist(parrot);
    }



}

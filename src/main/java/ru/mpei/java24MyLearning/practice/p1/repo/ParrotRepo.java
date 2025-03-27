package ru.mpei.java24MyLearning.practice.p1.repo;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.mpei.java24MyLearning.practice.p1.model.Color;
import ru.mpei.java24MyLearning.practice.p1.model.Parrot;

@Repository
@ComponentScan
public class ParrotRepo {

    @Autowired
    @PersistenceContext
    private EntityManager em;

    @Autowired
    public ObjectMapper mapper = new ObjectMapper();

    @SneakyThrows
    public void createParrots() {
        String name = "Питух - ";
        Parrot p = new Parrot();
        for (int i = 2; i < 8; i++) {
            p.setId(i);
            p.setName(name + i);
            p.setColor(Color.getRandomColor().toString());
            p.setAge(i);
            String s = mapper.writeValueAsString(p);
            em.persist(p);
        }
    }

    public Parrot getParrotById(long id) {
        return em.find(Parrot.class, id);
    }

    public void updateParrot(Parrot parrot) {
        em.merge(parrot);
    }

    public void deleteParrotById(int id) {
        Parrot parrot = em.find(Parrot.class, id);
        em.remove(parrot);
    }

    public void addParrot(Parrot parrot) {
        em.persist(parrot);
    }



}

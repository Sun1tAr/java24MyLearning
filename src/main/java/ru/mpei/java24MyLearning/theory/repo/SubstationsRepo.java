package ru.mpei.java24MyLearning.theory.repo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.mpei.java24MyLearning.theory.model.Substation;

@Repository
public class SubstationsRepo {

    @PersistenceContext
    private EntityManager em;

    public boolean save(Substation substation) {
        em.persist(substation);
        return true;
    }

    public Substation getById(int id) {
        return em.find(Substation.class, id);
    }

}

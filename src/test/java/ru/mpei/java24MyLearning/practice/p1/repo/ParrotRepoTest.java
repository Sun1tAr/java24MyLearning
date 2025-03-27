package ru.mpei.java24MyLearning.practice.p1.repo;

import org.junit.jupiter.api.Test;
import ru.mpei.java24MyLearning.practice.p1.model.Parrot;

import static org.junit.jupiter.api.Assertions.*;

class ParrotRepoTest {

    @Test
    void getParrotById() {
        ParrotRepo parrotRepo = new ParrotRepo();
        Parrot parrotById = parrotRepo.getParrotById(1);
        assertNotNull(parrotById);
    }
}
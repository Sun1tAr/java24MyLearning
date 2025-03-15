package ru.mpei.java24MyLearning.practice.p1.repo;

import org.springframework.stereotype.Repository;
import ru.mpei.java24MyLearning.practice.p1.model.Color;
import ru.mpei.java24MyLearning.practice.p1.model.Parrot;

import java.util.*;

@Repository
public class InMemoryParrotRepo {
    List<Parrot> parrots = new ArrayList<>();

    public void saveParrot(Parrot parrot) {
        if (parrot != null) {
            parrots.add(parrot);
        }
    }

    public void saveParrots(Collection<Parrot> parrots) {
        if (parrots != null) {
            this.parrots.addAll(parrots);
        }
    }

    public Optional<List<Parrot>> getParrotsByColor(Color color) {
        if (color == null) {
            return Optional.empty();
        }

        List<Parrot> parrotsWithColor = new ArrayList<>();
        for (Parrot parrot : parrots) {
            if (parrot.getColor().equals(color)) {
                parrotsWithColor.add(parrot);
            }
        }
        return parrotsWithColor.isEmpty() ? Optional.empty() : Optional.of(parrotsWithColor);
    }


}

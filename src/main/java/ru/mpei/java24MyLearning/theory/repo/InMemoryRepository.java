package ru.mpei.java24MyLearning.theory.repo;

import org.springframework.stereotype.Repository;
import ru.mpei.java24MyLearning.theory.model.Measurement;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryRepository {
    private Map<String, Double> storage = new HashMap<>();

    public void save(Measurement measurement) {
        storage.put(measurement.getName(), measurement.getValue());
    }
    public Measurement get(String measurementId) {
        if (storage.containsKey(measurementId)) {
            return new Measurement(measurementId, storage.get(measurementId));
        } else {
            throw new RuntimeException("Measurement not found!");
        }
    }
}

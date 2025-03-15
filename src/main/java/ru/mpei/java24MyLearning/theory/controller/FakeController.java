package ru.mpei.java24MyLearning.theory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.mpei.java24MyLearning.theory.model.Person;
import ru.mpei.java24MyLearning.theory.service.ConfigState;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class FakeController {

    private AtomicInteger count = new AtomicInteger(0);
    @Autowired
    private ConfigState state;

//    @PostConstruct
    public void startChange() {
        Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay (() -> {
            state.setData(new Person("Oleg", count.incrementAndGet(), "NeMale"));
            }, 5000, 5000, TimeUnit.MILLISECONDS
        );
    }
}

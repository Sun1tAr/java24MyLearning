package ru.mpei.java24MyLearning.practice.p1.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;

@Component
public class TesterOfParrotsSerialization {

    ArrayList<Parrot> parrots = new ArrayList<>();

    @Autowired
    ObjectMapper mapper;

    @SneakyThrows
//    @PostConstruct
    public void init() {
        Parrot parrot = new Parrot();
        parrot.setAge(1);
        parrot.setName("Parrot1");
        parrot.setColor(Color.BLUE.toString());
        parrots.add(parrot);

        parrot = new Parrot();
        parrot.setAge(2);
        parrot.setName("Parrot2");
        parrot.setColor(Color.RED.toString());
        parrots.add(parrot);

        parrot = new Parrot();
        parrot.setAge(3);
        parrot.setName("Parrot3");
        parrot.setColor(Color.GREEN.toString());
        parrots.add(parrot);

        parrot = new Parrot();
        parrot.setAge(4);
        parrot.setName("Parrot4");
        parrot.setColor(Color.GREEN.toString());
        parrots.add(parrot);

        parrot = new Parrot();
        parrot.setAge(5);
        parrot.setName("Parrot5");
        parrot.setColor(Color.RED.toString());
        parrots.add(parrot);

        parrot = new Parrot();
        parrot.setAge(6);
        parrot.setName("Parrot6");
        parrot.setColor(Color.GREEN.toString());
        parrots.add(parrot);

        parrot = new Parrot();
        parrot.setAge(7);
        parrot.setName("Parrot7");
        parrot.setColor(Color.GREEN.toString());
        parrots.add(parrot);

        parrot = new Parrot();
        parrot.setAge(8);
        parrot.setName("Parrot8");
        parrot.setColor(Color.RED.toString());
        parrots.add(parrot);

        parrot = new Parrot();
        parrot.setAge(9);
        parrot.setName("Parrot9");
        parrot.setColor(Color.GREEN.toString());
        parrots.add(parrot);

        parrot = new Parrot();
        parrot.setAge(40);
        parrot.setName("Parrot40");
        parrot.setColor(Color.GREEN.toString());
        parrots.add(parrot);

        System.out.println(parrots);
        String s = mapper.writeValueAsString(parrots);
        System.out.println(s);

        mapper.writeValue(new File("src/main/resources/tester.json"), parrots);

    }

}

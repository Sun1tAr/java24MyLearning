package ru.mpei.java24MyLearning.theory.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.mpei.java24MyLearning.theory.model.Person;

import java.io.File;

@Component
public class ConfigState {

    @Getter
    private Person data;
    @Autowired
    private ObjectMapper mapper;

    @PostConstruct
    @SneakyThrows
    public void readConfig() {
        String path = "src/main/resources/iniCfg.json";
        Person person = mapper.readValue(new File(path), Person.class);
        this.setData(person);
    }

    public void setData(Person data) {
        this.data = data;
        System.out.println("NEW STATE: " + data);
    }
}

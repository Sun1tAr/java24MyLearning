package ru.mpei.java24MyLearning.model;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.mpei.java24MyLearning.theory.model.Person;

class PersonTest {

    private ObjectMapper mapper = new ObjectMapper();

    @SneakyThrows
    @Test
    void serialize1() {
        Person person = new Person();
        person.setAge(12);
        person.setName("QWERT");
        person.setGender("POIU");
        String s = mapper.writeValueAsString(person);
        System.out.println(s);
    }

    @SneakyThrows
    @Test
    void deserialize1() {
        String json = "{\"ageOfPerson\":12,\"nameOfPerson\":\"QWERT\",\"genderOfPerson\":\"POIU\"}";
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);
    }

    @BeforeEach
    void configureMapper() {
        mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
    }

}
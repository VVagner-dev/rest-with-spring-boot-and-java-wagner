package com.wagner.rest_with_spring_boot_and_java_wagner.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RestController;

import com.wagner.rest_with_spring_boot_and_java_wagner.model.Person;
import com.wagner.rest_with_spring_boot_and_java_wagner.services.PersonServices;

@RestController
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll() {
        logger.info("Find all people");
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            persons.add(mockPerson(i));
        }
        return persons;

    }

    public Person findById(String id) {
        logger.info("Finding one Person");

        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFistName("Wagner");
        person.setLastName("Cristo");
        person.setAddress("Da penha");
        person.setGender("masculino");
        return person;

    }

    public Person create(Person person) {
        logger.info("creating a person");
        return person;
    }

    public void delete(String id) {
        logger.info("delete one Person");

    }

    private Person mockPerson(int i) {
        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFistName("fist name - " + i);
        person.setLastName("last name - " + i);
        person.setAddress("address name - " + i);
        person.setGender("gender name - " + i);
        return person;
    }
}

package com.wagner.rest_with_spring_boot_and_java_wagner.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wagner.rest_with_spring_boot_and_java_wagner.exception.ResorceNotFoundException;
import com.wagner.rest_with_spring_boot_and_java_wagner.model.Person;
import com.wagner.rest_with_spring_boot_and_java_wagner.repository.PersonRepository;
import com.wagner.rest_with_spring_boot_and_java_wagner.services.PersonServices;

@Service
public class PersonServices {
    private Logger logger = LoggerFactory.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public List<Person> findAll() {
        logger.info("Find all people");
        return repository.findAll();

    }

    public Person findById(Long id) {
        logger.info("Finding one Person");
        return repository.findById(id).orElseThrow(() -> new ResorceNotFoundException("No record Found on this id"));

    }

    public Person create(Person person) {
        return repository.save(person);
    }

    public Person put(Person person) {
        findById(person.getId());
        return repository.save(person);
    }

    public ResponseEntity<?> delete(Long id) {
        repository.delete(findById(id));
        logger.info("Delete one Person");
        return ResponseEntity.noContent().build();

    }
}

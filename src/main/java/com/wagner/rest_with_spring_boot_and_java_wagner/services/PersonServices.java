package com.wagner.rest_with_spring_boot_and_java_wagner.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagner.rest_with_spring_boot_and_java_wagner.data.dto.PersonDTO;
import com.wagner.rest_with_spring_boot_and_java_wagner.exception.ResorceNotFoundException;
import static com.wagner.rest_with_spring_boot_and_java_wagner.mapper.ObjectMapper.perseObject;
import com.wagner.rest_with_spring_boot_and_java_wagner.model.Person;
import com.wagner.rest_with_spring_boot_and_java_wagner.repository.PersonRepository;

@Service
public class PersonServices {
    private Logger logger = LoggerFactory.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public List<PersonDTO> findAll() {
        logger.info("Find all people");
        return perseObject(repository.findAll(), PersonDTO.class);

    }

    public PersonDTO findById(Long id) {
        logger.info("Finding one Person");
        return perseObject(
                repository.findById(id).orElseThrow(() -> new ResorceNotFoundException("No record Found on this id")),
                PersonDTO.class);

    }

    public PersonDTO create(PersonDTO person) {
        var entity = perseObject(person, Person.class);
        return perseObject(repository.save(entity), PersonDTO.class);
    }

    public PersonDTO put(PersonDTO person) {
        findById(person.getId());
        var entity = perseObject(person, Person.class);
        return perseObject(repository.save(entity), PersonDTO.class);
    }

    public void delete(Long id) {
        var entity = perseObject(findById(id), Person.class);
        repository.delete(entity);
        logger.info("Delete one Person");
    }
}

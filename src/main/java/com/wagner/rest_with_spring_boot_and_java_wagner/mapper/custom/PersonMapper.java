package com.wagner.rest_with_spring_boot_and_java_wagner.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.wagner.rest_with_spring_boot_and_java_wagner.data.dto.v2.PersonDTOV2;
import com.wagner.rest_with_spring_boot_and_java_wagner.model.Person;

@Service
public class PersonMapper {

    public PersonDTOV2 convertEntityToDTO(Person person) {
        PersonDTOV2 dto = new PersonDTOV2();
        dto.setId(person.getId());
        dto.setFirstName(person.getfirstName());
        dto.setLastName(person.getLastName());
        dto.setBirthDay(new Date());
        dto.setAddress(person.getAddress());
        dto.setGender(person.getGender());
        return dto;
    }

    public Person convertDTOtoEntity(PersonDTOV2 dto) {
        Person entity = new Person();
        entity.setId(dto.getId());
        entity.setfirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        // entity.setBirthDay(new Date());
        entity.setAddress(dto.getAddress());
        entity.setGender(dto.getGender());
        return entity;
    }

}

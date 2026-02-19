package com.wagner.rest_with_spring_boot_and_java_wagner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wagner.rest_with_spring_boot_and_java_wagner.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

package com.wagner.rest_with_spring_boot_and_java_wagner.controller;

import org.springframework.web.bind.annotation.RestController;

import com.wagner.rest_with_spring_boot_and_java_wagner.services.PersonServices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TesteLogControler {

    private Logger logger = LoggerFactory.getLogger(PersonServices.class.getName());

    @GetMapping("/test")
    public String testLog() {
        logger.debug("debug log");
        logger.warn("warn log");
        logger.info("info log");
        logger.error("error log");
        return "Logs genarated successfuly";
    }
}

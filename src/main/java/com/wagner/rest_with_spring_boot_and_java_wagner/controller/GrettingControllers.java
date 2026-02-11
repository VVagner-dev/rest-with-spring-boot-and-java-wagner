package com.wagner.rest_with_spring_boot_and_java_wagner.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wagner.rest_with_spring_boot_and_java_wagner.model.Gretting;

@RestController
public class GrettingControllers {

    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greetting")
    public Gretting gretting(
            @RequestParam(value = "name", defaultValue = "World") String name) {
        return new Gretting(counter.incrementAndGet(), String.format(template, name));
    }

}

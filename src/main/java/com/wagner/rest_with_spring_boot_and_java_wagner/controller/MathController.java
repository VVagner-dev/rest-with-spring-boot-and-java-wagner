package com.wagner.rest_with_spring_boot_and_java_wagner.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagner.rest_with_spring_boot_and_java_wagner.exception.UnsupportedMathOperetionException;

@RestController
@RequestMapping("/Math")
public class MathController {

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedMathOperetionException("Coloque um valor numerico");
        return Double.parseDouble(numberOne.replace(",", ".")) + Double.parseDouble(numberTwo.replace(",", "."));
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty())
            return false;
        String number = strNumber.replace(",", ".");
        if (number.matches("[-+]?[0-9]*\\.?[0-9]+"))
            return true;
        return false;
    }
}

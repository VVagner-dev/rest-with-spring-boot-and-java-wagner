package com.wagner.rest_with_spring_boot_and_java_wagner.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagner.rest_with_spring_boot_and_java_wagner.exception.UnsupportedMathOperetionException;
import com.wagner.rest_with_spring_boot_and_java_wagner.util.SimpleMath;
import com.wagner.rest_with_spring_boot_and_java_wagner.util.VerificarNumber;

@RestController
@RequestMapping("/Math")
public class MathController {

    SimpleMath sm = new SimpleMath();

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        verificar(numberTwo, numberOne, numberTwo);
        return sm.sum(numberOne, numberTwo);
    }

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        verificar(numberTwo, numberOne, numberTwo);
        return sm.sub(numberOne, numberTwo);
    }

    @RequestMapping("mult/{numberOne}/{numberTwo}")
    public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        verificar(numberTwo, numberOne, numberTwo);
        return sm.mult(numberOne, numberTwo);
    }

    @RequestMapping("div/{numberOne}/{numberTwo}")
    public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        verificar(numberTwo, numberOne, numberTwo);
        return sm.div(numberOne, numberTwo);
    }

    @RequestMapping("raiz/{number}")
    public Double raiz(@PathVariable("number") String number) {
        if (!VerificarNumber.isNumeric(number))
            throw new UnsupportedMathOperetionException("Coloque um numero adequado");
        return sm.raiz(number);
    }

    private void verificar(String menssage, String numberOne, String numberTwo) {
        if (!VerificarNumber.isNumeric(numberOne) || !VerificarNumber.isNumeric(numberTwo))
            throw new UnsupportedMathOperetionException(menssage);

    }

}

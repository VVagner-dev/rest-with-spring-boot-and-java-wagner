package com.wagner.rest_with_spring_boot_and_java_wagner.util;

public class SimpleMath {

    public Double sum(String numberOne, String numberTwo) {
        return Double.parseDouble(numberOne.replace(",", ".")) + Double.parseDouble(numberTwo.replace(",", "."));
    }

    public Double sub(String numberOne, String numberTwo) {
        return Double.parseDouble(numberOne.replace(",", ".")) - Double.parseDouble(numberTwo.replace(",", "."));
    }

    public Double mult(String numberOne, String numberTwo) {
        return Double.parseDouble(numberOne.replace(",", ".")) * Double.parseDouble(numberTwo.replace(",", "."));
    }

    public Double div(String numberOne, String numberTwo) {
        return Double.parseDouble(numberOne.replace(",", ".")) / Double.parseDouble(numberTwo.replace(",", "."));
    }

    public Double raiz(String number) {
        return Math.sqrt(Double.parseDouble(number.replace(",", ".")));
    }

}

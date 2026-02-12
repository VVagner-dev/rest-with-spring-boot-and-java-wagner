package com.wagner.rest_with_spring_boot_and_java_wagner.util;

public class VerificarNumber {

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty())
            return false;
        String number = strNumber.replace(",", ".");
        if (number.matches("[-+]?[0-9]*\\.?[0-9]+"))
            return true;
        return false;
    }

}

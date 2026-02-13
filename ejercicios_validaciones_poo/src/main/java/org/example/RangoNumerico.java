package org.example;

public class RangoNumerico {
    public static boolean validarRango (int numero, int min, int max) {
        if (numero>max || numero<min){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validarRango(10,2,15));
    }
}

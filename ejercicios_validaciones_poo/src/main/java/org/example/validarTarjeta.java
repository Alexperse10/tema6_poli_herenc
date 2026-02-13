package org.example;

public class validarTarjeta {

    public static boolean validarTarjeta(String tarjeta) {
        if (tarjeta.length() != 16) {
            return false;
        }
        for (int i = 0; i < tarjeta.length(); i++) {
            char caracteres = tarjeta.charAt(i);
            if (!Character.isDigit(caracteres)) {
                return false;
            }


        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(validarTarjeta("1234567894568546"));
    }
}

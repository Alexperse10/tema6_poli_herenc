package org.example;

public class Validartipotarjeta {

    public static boolean validarTipo (String tipo) {
        if (!tipo.equalsIgnoreCase("VISA") && !tipo.equalsIgnoreCase("MASTERCARD") && !tipo.equalsIgnoreCase("MAESTRO")){
            return false;  // si ocurre cualquiero de estas tres cosas es false por eso no se pone ||, si no es ninguno de esto !tipo y &&
        }

        return  true;
    }

    public static void main(String[] args) {
        System.out.println(validarTipo("VISA"));
    }
}

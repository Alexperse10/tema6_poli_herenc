package org.example;

public class LongitudExacta {

    public static boolean validarLongitud(String texto, int longitud){
        if (texto == null){  // se debe poner la condicion con null porque sino puede romper el programa
            return false;
        }
        return texto.length() == longitud; // se compara la longitud del texto con la longitud y si es true se acepta
    }

    public static void main(String[] args) {
        System.out.println(validarLongitud("123456789",9));
        System.out.println(validarLongitud("454564g",10));

    }



}

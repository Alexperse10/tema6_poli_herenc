package org.example;

public class TelefonoValidar {
    public static boolean validarTelefono(String telefono){
        int contador_caracteres =0;
        if (telefono == null || telefono.isEmpty()){
            return false;

        }

        if (telefono.length() != 9){
                return false;
        }
        for (int i =0; i<telefono.length(); i++){
            char caracteres = telefono.charAt(i);
        if (!Character.isDigit(caracteres)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(validarTelefono("1542a8589"));
    }
}

package org.example;

public class solonumeros {
    public static boolean esnumerico(String texto) {
        if (texto == null || texto.isEmpty() ){
            return false;
        }
        for (int i =0; i <texto.length(); i++){
            char caract = texto.charAt(i);
            //if (caract<'0'|| caract>'9'){
              //  return false;
            if (!Character.isDigit(caract)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(esnumerico("12365"));
        System.out.println(esnumerico("12a45"));
    }
}

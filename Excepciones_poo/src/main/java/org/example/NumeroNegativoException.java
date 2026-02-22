package org.example;

public class NumeroNegativoException extends Exception{  // extens significa que estamos creando una checked Exception

    public NumeroNegativoException() { // se crea el constructor
        super("el numero no puede ser negativo");
        // llama al constructor de exception y le pasa el mensaje que se mostrar cuando ocurra el error

        }
    }


package org.example;

public class EdadInvalidaExcepcion extends Exception{
    public EdadInvalidaExcepcion() { // se crea el constructor
        super("Debe ser mayod e edad "); // es de tipo checked
    }
}

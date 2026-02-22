package org.example;

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) throws EdadInvalidaExcepcion { // en este ejercicio hacemos validacion en constructor
        this.nombre = nombre;

        if (edad<18) {
            throw new EdadInvalidaExcepcion();
        }
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        try {
            Usuario alex = new Usuario("alex", 15);
        } catch (EdadInvalidaExcepcion e){
            System.out.println(e.getMessage());
        }
    }


}


package org.example;

/**
 * clase abstracta que muestra a una persona del mutxamelFC.
 * No se puede crear un objeto directamente de esta clase,
 * sirve como base para que otras clases la hereden
 * Implementa la interfaz funcionesintegrales
 */

public abstract class Mutxamelfc implements Funcionesintegrales{ // la clase abstract no puede instanciarse directamente y sirve como modelo o base para que otras la extiendan
    /**
     * nombre de la persona
     */
    private String nombre;
    /**
     * edad de la persona
     */
    private int edad;
/**
 * contructor que inicia el nombre y la edad
 * @param nombre nombre la persona
 * @param edad edad de la persona
 */
public Mutxamelfc(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
}

    /**
     * duelve el nombre
     * @return nombre
     */

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mutxamelfc{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

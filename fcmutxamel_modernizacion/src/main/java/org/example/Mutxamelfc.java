package org.example;

public abstract class Mutxamelfc implements Funcionesintegrales{ // la clase abstract no puede instanciarse directamente y sirve como modelo o base para que otras la extiendan
    private String nombre;
    private int edad;

public Mutxamelfc() {
    this.nombre = nombre;
    this.edad = edad;
}

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

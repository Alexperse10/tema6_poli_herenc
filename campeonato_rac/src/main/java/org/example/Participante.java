package org.example;

public abstract class Participante {
    private String nombre;
    private int edad;
    private int puntostotales;

    public Participante(String nombre, int edad, int puntostotales) throws EdadinvalidExc {
        this.nombre = nombre;
        if (edad<18){
            throw new EdadinvalidExc();
        }
        this.edad = edad;
        this.puntostotales = puntostotales;

    }
    public abstract int calcularRendimiento();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPuntostotales(int puntostotales) {
        this.puntostotales = puntostotales;
    }

    public int getPuntostotales() {
        return puntostotales;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", puntostotales=" + puntostotales +
                '}';
    }
}

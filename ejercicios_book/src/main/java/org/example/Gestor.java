package org.example;

public class Gestor {
    public String nombre;
    double importemax; // visibilidad por defecto
    private int numerotel;

    public Gestor(String nombre, double importemax, int numerotel ) {
        this.nombre = nombre;
        this.importemax = importemax;
        this.numerotel = numerotel;
    }

    public Gestor(String nombre, int numerotel){
        this(nombre,1000000,numerotel);
    }

    public int getNumerotel() {
        return numerotel;
    }

    public void mostrarinfo() {
        System.out.println("nombre: "+nombre);
        System.out.println("telefono "+numerotel);
        System.out.println("importe max "+importemax);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImportemax(double importemax) {
        this.importemax = importemax;
    }

    public double getImportemax() {
        return importemax;
    }

    public void setNumerotel(int numerotel) {
        this.numerotel = numerotel;
    }

    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", importemax=" + importemax +
                ", numerotel=" + numerotel +
                '}';
    }
}

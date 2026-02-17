package org.example;

public abstract class Dispositivo {
    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.estado = false;
    }

    public abstract void encender();

    public boolean apagar() {
        if (estado == false) {  // es comparacion sirve para pregutnar si dos cosas son iguales
            System.out.println("el dispositivo "+nombre +" ya esta apagado");
        }else {
            estado = false; // sirve para darle un valor a una variable
            System.out.println(nombre +" apagado");
        }
        return estado;
    }

    public void mostrarestado () {
        if (estado) {
            System.out.println("el "+nombre+"  esta encendido");
        }else {
            System.out.println("el "+nombre+" esta apagado");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}

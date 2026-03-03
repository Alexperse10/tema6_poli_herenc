package org.example;

public class Bombilla {
    private boolean estado;

    public Bombilla(){
        this.estado = false;
    }

    public void encender(){
        if (!estado) {  // si la bombilla no esta encendida es decir si no es true
            estado = true;
            System.out.println("la bombilla esta encendida");
        }
    }

    public void apagar() {
        if (estado) {
            estado = false;
            System.out.println("la bombilla esta apagada");
        }
    }


    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void mostrarinfo() {
        System.out.println("el estado de la bombilla es: "+estado);
    }

    @Override
    public String toString() {
        return "Bombilla{" +
                "estado=" + estado +
                '}';
    }
}

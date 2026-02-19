package org.example;

public class Jugador extends Mutxamelfc implements AccionesDeportivas{
    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(int dorsal, Equipos categoria, Posiciones posicion) {
        this.dorsal = dorsal;
        this.categoria = categoria;
        this.posicion = posicion;
    }

    public void calentar() {

    }

    public void descansa() {

    }
    public void marcargol() {

    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar(String ciudad) {

    }

    @Override
    public void celebrar() {

    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

    }
}

package org.example;

import java.sql.Struct;

public class Acompañante extends Mutxamelfc{
    private Jugador integrante;
    private String parentesto;

    public Acompañante(String parentesto, Jugador integrante) {
        this.parentesto = parentesto;
        this.integrante = integrante;
    }

    public void animarEquipo(){


    }

    public String getParentesto() {
        return parentesto;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setParentesto(String parentesto) {
        this.parentesto = parentesto;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
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
}

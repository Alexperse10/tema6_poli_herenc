package org.example;

import java.sql.Struct;
import java.util.ArrayList;

public class Acompañante extends Mutxamelfc{
    private ArrayList<Jugador> integrante;
    private String parentesto;

    public Acompañante(String parentesto, Jugador integrante, String nombre, int edad) {
        super(nombre, edad);
        this.parentesto = parentesto;
        this.integrante = new ArrayList<>();
    }


    public void añadirjugador(Jugador jugador){
        integrante.add(jugador);
    }
    public void animarEquipo(){
System.out.println("el acompañante esta animando ");

    }

    public String getParentesto() {
        return parentesto;
    }

    public ArrayList<Jugador> getIntegrante() {
        return integrante;
    }

    public void setParentesto(String parentesto) {
        this.parentesto = parentesto;
    }

    public void setIntegrante(ArrayList<Jugador> integrante) {
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

    @Override
    public String toString() {
        return "Acompañante{" +
                "integrante=" + integrante +
                ", parentesto='" + parentesto + '\'' +
                '}';
    }
}

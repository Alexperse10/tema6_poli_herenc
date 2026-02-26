package org.example;

import java.sql.Struct;
import java.util.ArrayList;
/**
 * Clase que muestra a un acompañante de un jugador.
 * Hereda de Mutxamelfc
 * Puede estar relacionado a uno o varios jugadores
 * y tiene un parentesco
 */
public class Acompañante extends Mutxamelfc{

    private ArrayList<Jugador> integrante;
    private String parentesto;

    /**
     * Constructor del acompañante
     * @param parentesto relacion que tiene con el jugador
     * @param nombre nombre del acompañante
     * @param edad edad del acompañante
     */

    public Acompañante(String parentesto, String nombre, int edad) {
        super(nombre, edad);
        this.parentesto = parentesto;
        this.integrante = new ArrayList<>();
    }

    /** añade un jugador a la lista */
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

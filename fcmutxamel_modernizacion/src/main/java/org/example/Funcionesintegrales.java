package org.example;
/**
 * Interfaz que define las acciones generales que pueden hacer
 * las personas del equipo (jugadores, entrenador, masajista...).
 * Todas las clases que la implementen tienen que desarrollar
 * estos metodos.
 */
public interface Funcionesintegrales {
    /** metodo para cuando se concentran antes de un partido */
    public void concentrarse();
    /**
     * metodo para viajar a otra ciudad
     * @param ciudad ciudad a la que viajan
     */
    public void viajar(String ciudad);
    /** metodo para celebrar una victoria o un gol */
    public void celebrar();

    }


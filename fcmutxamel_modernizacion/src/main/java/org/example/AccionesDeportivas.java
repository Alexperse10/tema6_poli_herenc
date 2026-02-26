package org.example;
/**
 * Interfaz que define las acciones deportivas
 * que pueden hacer jugadores y entrenadores.
 * Las clases que la implementen tienen que
 * desarrollar estos metodos.
 */
public interface AccionesDeportivas {

    public void entrenar ();
    /**
     * metodo para jugar un partido contra un rival
     * @param rival nombre del equipo contrario
     */
    public void jugarPartido(String rival);
}

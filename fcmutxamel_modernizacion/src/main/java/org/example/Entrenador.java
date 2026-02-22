package org.example;

public class Entrenador extends Mutxamelfc implements AccionesDeportivas{
    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(Equipos equipo, String formacionPreferida) {
        this.equipo = equipo;
        this.formacionPreferida = formacionPreferida;
    }



    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void planificarEntrenamiento() {

    }

    public void hacerCambios() {

    }


    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

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

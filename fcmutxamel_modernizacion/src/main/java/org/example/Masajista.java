package org.example;

public class Masajista extends Mutxamelfc{
    private String titulacion;
    private int anosExperiencia;

    public Masajista(String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia= anosExperiencia;

    }

    public void darMasaje(Jugador jugador){

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

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }
}

package org.example;

public class Piloto extends Participante{
        private String coche;
        private String matricula;
        private Niveldificultad nivel;

    public Piloto(String nombre, int edad, int puntostotales, String coche, String matricula, Niveldificultad nivel) throws Formatoincorrexc, EdadinvalidExc {
        super(nombre, edad, puntostotales);
        if (!matricula.matches("\\d{4}[A-Z]{3}")) {
            throw new Formatoincorrexc();
        }
        this.coche = coche;
        this.matricula = matricula;
        this.nivel = nivel;

    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNivel(Niveldificultad nivel) {
        this.nivel = nivel;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Niveldificultad getNivel() {
        return nivel;
    }

    @Override
    public int calcularRendimiento() {
        int random = (int)(Math.random()*11);
        return random;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "coche='" + coche + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}

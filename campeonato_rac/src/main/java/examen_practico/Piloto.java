package examen_practico;

import java.util.Random;

public class Piloto extends Participante{
 private int dorsal;
 private Categoria categoria;
 private Coche coche;
 private int puntos;
Random aleatorio = new Random();
    public Piloto(String nombre, int edad, int dorsal, Categoria categoria, Coche coche, int puntos) {
        super(nombre, edad);
        this.categoria = categoria;
        this.coche = coche;
        this.puntos = 0;
        this.dorsal = dorsal;
    }

    public void competir() {
        int numero_aleatorio = aleatorio.nextInt(10)+1;
        System.out.println(getNombre() +" ha obtenido "+puntos);
    }

    public int getPuntos() {
        return puntos;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Coche getCoche() {
        return coche;
    }


    @Override
    public void presentarse() {

    }

    @Override
    public String toString() {
        return "Piloto{" +
                "dorsal=" + dorsal +
                ", categoria=" + categoria +
                ", coche=" + coche +
                ", puntos=" + puntos +
                '}';
    }
}

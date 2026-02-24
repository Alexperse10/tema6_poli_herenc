package org.example;

public class Jugador extends Mutxamelfc implements AccionesDeportivas{
    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;
    //private static int contador =0;
    //private int id;

    public Jugador(int dorsal, Equipos categoria, Posiciones posicion, String nombre, int edad) {
        super(nombre, edad);
        this.dorsal = dorsal;
        this.categoria = categoria;
        this.posicion = posicion;
        //contador++;
        //this.id = contador;
    }

    public void calentar() {

    }

    public void descansa() {
        System.out.println("el jugador "+getNombre()+ "esta descansado");
    }
    public void marcargol() {
        System.out.println("el jugador "+getNombre() +" ha marcado GOOOOO!!!!");
    }

   // public int getContador() {
        //return contador;
   // }

    //public int getId() {
        //return id;
   //}

    @Override
    public void concentrarse() {
        System.out.println("el jugador "+getNombre()+" se esta concentrando para el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("el jugador "+getNombre() +" esta viajando a" +ciudad);
    }

    @Override
    public void celebrar() {
        System.out.println("el jugador "+getNombre() +" con dorsal "+getDorsal() + " ha celebrado un gol");
    }

    @Override
    public void entrenar() {
        System.out.println("el jugador "+getNombre() +"con dorsal" +getDorsal() +" esta entrenando");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("el equipo "+Equipos.SENIOR +"esta jugando un partido contra "+rival);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public int getDorsal() {
        return dorsal;
    }

    @Override
    public String toString() {
        return "Jugador{ " +
                // id +" ,"+
                " categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", posicion=" + posicion +
                ", nombre="+getNombre() +
                ", edad="+getEdad()+
                '}';
    }
}

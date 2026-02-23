package org.example;

public class AppMutxamelFC {
    public static void main(String[] args) throws FormatoCorrecto {
        System.out.println(" == App mantenimiento del Mutxamel ==");
        switch ()

        Jugador jugador1 = new Jugador(10, Equipos.senior, Posiciones.delantero,"alex",20);
        Jugador jugador2 = new Jugador(4, Equipos.senior, Posiciones.centrocampista,"ronnie",15);
        Jugador jugador3 = new Jugador(6, Equipos.senior, Posiciones.centrocampista, "depaul",22);
        Jugador Jugador4 = new Jugador(7, Equipos.senior, Posiciones.delantero, "cocu",17);
        Jugador jugador5 = new Jugador(8, Equipos.senior, Posiciones.defensa, "messi",45);
        Masajista masakista1 = new Masajista("fisio",20,"pipe",50);
        Acompañante acompañante1 = new Acompañante("padre",jugador1,"juanjo",60);
        Entrenador entrenador1 = new Entrenador(Equipos.senior,"4-4-2", "hansi", 60);
        acompañante1.añadirjugador(jugador2);
        jugador1.concentrarse();
        jugador2.entrenar();
        masakista1.darMasaje(jugador1);
        entrenador1.planificarEntrenamiento();
        jugador1.viajar("madrid");
        jugador5.descansa();
        masakista1.darMasaje(jugador2);



    }
}
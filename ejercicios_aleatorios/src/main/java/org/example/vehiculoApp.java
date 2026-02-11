package org.example;

import java.util.ArrayList;

public class vehiculoApp {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listavehiculos = new ArrayList<>();
        Vehiculo lambo = new Coche();
        Vehiculo ducati = new Moto();
        Vehiculo pegaso = new Camion();

        listavehiculos.add(lambo);
        listavehiculos.add(ducati);
        listavehiculos.add(pegaso);

        for (Vehiculo vehiculo : listavehiculos) {
            vehiculo.arrancar();
        }

    }
    public static void probararranque (Vehiculo vehiculo ) {
        vehiculo.arrancar();
    }
}

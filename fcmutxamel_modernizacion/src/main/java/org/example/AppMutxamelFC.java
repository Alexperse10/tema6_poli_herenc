package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMutxamelFC {

    public static void main(String[] args) throws FormatoCorrecto {

        Scanner sc = new Scanner(System.in);
        char opcion;
        char opcion1;
        ArrayList<Jugador> listajugadores = new ArrayList<>();
        do {

            System.out.println(" == App mantenimiento del Mutxamel ==");
            System.out.println("[1] Mantenimiento de jugadores");
            System.out.println("[2] ");
            System.out.println("[x] salir");
            System.out.print("Introduce una opcion: ");
            opcion = sc.next().charAt(0);
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case '1':

                    do {

                        System.out.println("== Mantenimiento de jugadores ==");
                        System.out.println("[1] Añadir nuevo jugador");
                        System.out.println("[x] Volver al menu principal");
                        System.out.print("Selecciona una opcion ---> ");
                        opcion1 = sc.next().charAt(0);
                        sc.nextLine();

                        switch (opcion1) {

                            case '1':

                                System.out.print("Nombre del jugador: ");
                                String nombre = sc.nextLine();
                                System.out.print("Edad: ");
                                int edad = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Selecciona categoria:");
                                for (Equipos equipo : Equipos.values()) {
                                    System.out.println(equipo);
                                }

                                Equipos categoria = Equipos.valueOf(sc.next().toUpperCase());
                                sc.nextLine();

                                System.out.println("Selecciona la posicion:");
                                for (Posiciones posicion : Posiciones.values()) {
                                    System.out.println(posicion);
                                }

                                Posiciones puesto = Posiciones.valueOf(sc.next().toUpperCase());
                                sc.nextLine();

                                System.out.print("Introduce el dorsal: ");
                                int dorsal = sc.nextInt();
                                sc.nextLine();

                                Jugador nuevoJugador = new Jugador(dorsal, categoria, puesto, nombre, edad);

                                listajugadores.add(nuevoJugador);

                                System.out.println("Jugador añadido correctamente.");

                                for (Jugador jugador : listajugadores) {
                                    System.out.println(jugador);
                                }
                                break;

                            case 'x':
                                System.out.println("Volviendo al menu principal...");
                                break;

                            default:
                                System.out.println("la opcion no es correcta");
                        }

                    } while (opcion1 != 'x');

                    break;
                    case 'x':
                    System.out.println("Saliendo de la aplicación...");
                    break;
            }

        } while (opcion != 'x');

        sc.close();
    }
}
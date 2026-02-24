package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMutxamelFC {

    public static void main(String[] args) throws FormatoCorrecto, Excepcionjugadorequipo {

        Scanner sc = new Scanner(System.in);
        char opcion;
        char opcion1;
        ArrayList<Jugador> listajugadores = new ArrayList<>();
        do {

            System.out.println(" == App mantenimiento del Mutxamel ==");
            System.out.println("[1] Mantenimiento de jugadores");
            System.out.println("[2] Mnatenimiento de entrenadores");
            System.out.println("[3] Mantenimiento de masajistas");
            System.out.println("[4] Consultar equipos");
            System.out.println("[x] salir");
            System.out.print("Introduce una opcion: ");
            opcion = sc.next().charAt(0);
            sc.nextLine();

            switch (opcion) {
                case '1':
                    do {

                        System.out.println("== Mantenimiento de jugadores ==");
                        System.out.println("[1] Añadir nuevo jugador");
                        System.out.println("[2] Modificar datos de jugador existente");
                        System.out.println("[3] Crear acompañantes");
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
                                System.out.print("Introduce el dorsal: ");
                                int dorsal = sc.nextInt();
                                Jugador nuevoJugador = new Jugador(dorsal, categoria, puesto, nombre, edad);

                                for (Jugador jugador : listajugadores)
                                    if (dorsal == jugador.getDorsal()) {
                                        throw new Excepcionjugadorequipo();
                                    }

                                listajugadores.add(nuevoJugador);

                                System.out.println("Jugador añadido correctamente.");

                                for (Jugador jugador : listajugadores) {
                                    System.out.println(jugador);
                                }
                                break;

                            case '2':
                                System.out.println(" === Mantenimiento de jugadores. Modificar datos de jugador existente ==");
                                System.out.println("De que jugador quieres hacer cambios?");
                                for (int i =0; i<listajugadores.size(); i++){
                                    System.out.println("["+i+"]"+ listajugadores.get(i));                                }
                                System.out.println(" =======================================================");

                                System.out.println("selecciona una opcion --->");
                                int opcion_jugador = sc.nextInt();

                                Jugador jugadorseleccion = listajugadores.get(opcion_jugador);

                                System.out.println("Modificando jugador " +jugadorseleccion);

                                System.out.println("¿que quieres modificar?[nombre,edad,categoria,dorsal,posicion]");

                                System.out.println("===============================");
                                System.out.println("Selecciona una opcion ");
                                String opcion_atributos = sc.nextLine().toLowerCase();

                                switch (opcion_atributos){
                                    case "nombre":
                                      System.out.println("Nuevo nombre: ");
                                      String nuevo_nombre = sc.nextLine();
                                      jugadorseleccion.setNombre(nuevo_nombre);

                                    case "edad":
                                        System.out.println("nueva edad");
                                        int nueva_edad = sc.nextInt();
                                        jugadorseleccion.setEdad(nueva_edad);


                                    case "categoria":
                                        System.out.println("Nueva categoria");
                                        int nueva_categoria = sc.nextInt();
                                        jugadorseleccion.

                                }








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


    }
}
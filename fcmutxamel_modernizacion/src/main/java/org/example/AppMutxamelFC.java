package org.example;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase principal de la aplicación.
 * Desde aquí se gestiona el mantenimiento del Mutxamel FC.
 * Permite crear y modificar jugadores, crear acompañantes
 * y consultar información mediante un menú por consola.
 */

public class AppMutxamelFC {
    /**
     * Metodo principal donde se ejecuta toda la aplicación.
     * Usa menus con Scanner para interactuar con el usuario.
     *
     * @param args argumentos del programa
     * @throws FormatoCorrecto si la formacion del entrenador no es valida
     * @throws Excepcionjugadorequipo si se intenta repetir dorsal en el mismo equipo
     */
    public static void main(String[] args) throws FormatoCorrecto, Excepcionjugadorequipo {

        Scanner sc = new Scanner(System.in);
        char opcion;
        char opcion1;

        /** lista donde se guardan los jugadores */
        ArrayList<Jugador> listajugadores = new ArrayList<>();
        /** lista donde se guardan los acompañantes */
        ArrayList<Acompañante> listaacompañante = new ArrayList<>();
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
                                sc.nextLine();
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
                                      System.out.println("el nombre esta actualizado");
                                      break;

                                    case "edad":
                                        System.out.println("nueva edad");
                                        int nueva_edad = sc.nextInt();
                                        sc.nextLine();
                                        jugadorseleccion.setEdad(nueva_edad);
                                        System.out.println("edad actualizada");
                                        break;

                                    case "categoria":
                                        System.out.println("Nueva categoria");
                                        for (Equipos equipo : Equipos.values()){
                                            System.out.print(equipo);
                                        }
                                        Equipos nuevacategoria = Equipos.valueOf(sc.next().toUpperCase());
                                        jugadorseleccion.setCategoria(nuevacategoria);
                                        System.out.println("Equipo actualizado");
                                        break;

                                    case "posicion":
                                        System.out.println("Selecciona la posicion");
                                        for (Posiciones posicion : Posiciones.values()){
                                            System.out.println(posicion);

                                        }
                                        Posiciones posicion_seleccion = Posiciones.valueOf(sc.next().toUpperCase());
                                        jugadorseleccion.setPosicion(posicion_seleccion);
                                        break;

                                    case "dorsal":
                                        System.out.println("que dorsal deseas introducir");
                                        int nuevo_dorsal = sc.nextInt();
                                        boolean ocupado = false;

                                        for (Jugador jugador_ : listajugadores) {
                                            if (jugador_ != jugadorseleccion && jugador_.getCategoria() == jugadorseleccion.getCategoria()
                                            && jugador_.getDorsal() == nuevo_dorsal) {
                                                ocupado = true;
                                                break;
                                            }
                                        }

                                        if (ocupado) {
                                            System.out.println("Lo siento el dorsal ya esta asignado");
                                        }else {
                                            jugadorseleccion.setDorsal(nuevo_dorsal);
                                            System.out.println("dorsal actualizado");
                                        }
                                        break;
                                    default:
                                        System.out.println("seleccion incorrecta");

                                }

                                break;
                            case '3':
                                System.out.println("seleccionar jugador");
                                int op_jug = sc.nextInt();
                                sc.nextLine();
                                for (int i=0; i<listajugadores.size(); i++){
                                    Jugador jugador = listajugadores.get(i);
                                    System.out.println("["+i+"]"+listajugadores.get(i));

                                }
                                jugadorseleccion = listajugadores.get(op_jug);

                                if (jugadorseleccion.getCategoria() != Equipos.SENIOR){
                                    System.out.println("debe ser de equipo senior");
                                    break;
                                }

                                System.out.println("introduce el nombre");
                                String nombre_acom = sc.nextLine();
                                System.out.println("introducir edad");
                                int edad_acom = sc.nextInt();
                                sc.nextLine();
                                System.out.println("introducir parentesco");
                                String parentesco_acom = sc.nextLine();

                                Acompañante nuevo_acompañante = new Acompañante(parentesco_acom,nombre_acom,edad_acom);

                                nuevo_acompañante.añadirjugador(jugadorseleccion);

                                System.out.println("Acompañante agregado");

                                listaacompañante.add(nuevo_acompañante);

                                break;

                            case 'x':
                                System.out.println("Volviendo al menu principal...");
                                break;

                            default:
                                System.out.println("la opcion no es correcta");
                        }
                        break;

                    } while (opcion1 != 'x');

                    break;
                    case 'x':
                    System.out.println("Saliendo de la aplicación...");
                    break;
            }

        } while (opcion != 'x');


    }
}
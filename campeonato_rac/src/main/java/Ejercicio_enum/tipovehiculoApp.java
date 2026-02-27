package Ejercicio_enum;

import java.util.Random;
import java.util.Scanner;

public class tipovehiculoApp {
    public static void main(String[] args) throws Excepcionenumicorrect {
        Scanner sc = new Scanner(System.in);
String tip_vehic;
        Random aleatorio = new Random(); // creo la variable random

        for (TipoVehiculo vehiculo : TipoVehiculo.values()){
            System.out.println(vehiculo);
        }
        try {
            System.out.println("introduce el tipo de vehiculo");
            tip_vehic = sc.nextLine().trim().toUpperCase();
            //el valeof sirve para convertir este string en un tipovehiculo
            TipoVehiculo variable = TipoVehiculo.valueOf(tip_vehic);
            // ojo el valueof necesita el mismo texto que el enum.
        }catch (IllegalArgumentException e){
            System.out.print("Error valor incorrecto");
        }
        TipoVehiculo[] lista = TipoVehiculo.values(); // un array con todos los valores del enum
        for (int i =0; i< lista.length; i++){
            System.out.println((i+1) + " - "+ lista[i]);

        }
        int numero_random = aleatorio.nextInt(10)+1; // aqui genero el numero, el ultimo numero 10 es excluyente por lo que debes de

        // poner es un +1   formula = (máximo - mínimo + 1)+ min depues debes sumar fuera del parentesis el numero de inicio es decir el minimo


        System.out.println("selecciona un numero");
        int opcion = sc.nextInt();
        if (opcion>=1 && opcion<= lista.length) {
            TipoVehiculo seleccionado = lista[opcion-1];
            switch (seleccionado) {
                case DRIFT:
                    System.out.println("El preparando para derrapes extremos ");
                    System.out.println("has optenido "+numero_random+ " puntos");
                    break;

                case RALLY:
                    System.out.println("vehiculo para terrenos dificiles");
                    System.out.println("has obtenido "+numero_random+ " puntos");
                    break;

                case FORMULA1:
                    System.out.println("Maxima velocidad en circuito");
                    System.out.println("has obtenido "+numero_random+ " puntos");
                    break;

                case KARTING:
                    System.out.println("ideal para iniciarse en competicion");
                    System.out.println("has obtenido "+numero_random+ " puntos");
                    break;

            }


        }else {
            System.out.print("opcion invalida");
        }

        if (numero_random >= 1 && numero_random <= 3) {
            System.out.println("El rendimiento es bajo");
        } else if (numero_random <= 7) {
            System.out.println("Buen rendimiento");
        } else {
            System.out.println("Rendimiento excelente");
        }

        System.out.println("Has obtenido " + numero_random + " puntos");

        System.out.println(evaluarRendimiento(numero_random));


    }
    public static String evaluarRendimiento(int puntos) { // en la variable puntos estas metiendo el numero_randomº

        if (puntos <= 3) {
            return "El rendimiento es bajo";
        } else if (puntos <= 7) {
            return "Buen rendimiento";
        } else {
            return "Rendimiento excelente";
        }
    }


}

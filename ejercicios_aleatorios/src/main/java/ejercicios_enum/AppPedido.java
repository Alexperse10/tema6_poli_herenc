package ejercicios_enum;

import java.util.Scanner;

public class AppPedido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EstadoPedido estado = EstadoPedido.recibido;
        System.out.println(estado);

        System.out.println("Elige un estado: Recibido, Procesando, enviado, entregado" );
        String texto = sc.nextLine().toUpperCase();

        EstadoPedido estado0 = EstadoPedido.valueOf(texto); // value of convierte el string en enum

        System.out.println("has elegido: "+estado0);

        // recorrer todo los valores con values

        System.out.println("todos los valores posibles");

        for (EstadoPedido estado_ : EstadoPedido.values()){
            System.out.println(estado_);
        }
    }
}

package org.example;

import java.util.Scanner;

public class Tienda  {

    public static void realizarPago (MetodoPago metodo){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿que importe quieres pagar?");
        double importe = sc.nextDouble();

        metodo.procesarPago(importe);

    }

    public static void iniciarPago() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- MENU DE METODOS DE PAGO ----");
        System.out.println("TARJETA DE CREDITO");
        System.out.println("PAYPAL");
        System.out.println("BIZUM");
        System.out.println("¿que metodo de pago quieres utilizar?");
        String metodo  = sc.nextLine();
        switch (metodo) {
            case "BIZUM":
                System.out.println("Introduce el numero de telefono vinculado con tu bizum: ");
                String telefono = sc.nextLine();
                Bizum bizum1 = new Bizum(telefono);
                System.out.println("introduce tu pin");
                int pin = sc.nextInt();
                String pin_string = String.valueOf(pin);
                System.out.println("validando Bizum...");
                if (bizum1.validarbizum(pin_string)) {
                    realizarPago(bizum1);
                    System.out.println("Pago aceptado. Muchas gracias");
                }else {
                    System.out.println("Los datos de tu bizum no son correctos.");
                }
                break;

            case "TARJETA":
                System.out.println("Introduce los datos de tu tarjeta: ");
                String datos_tarjeta = sc.nextLine();
                System.out.println("Introduce el tipo de tarjeta [VISA, MAESTRO, MASTERCARD]");
                String tipo = sc.nextLine();
                System.out.println("Validando tarjeta...");
                TarjetaCredito tarjeta1 = new TarjetaCredito(datos_tarjeta,tipo);
                if (tarjeta1.validarTarjeta()){
                    realizarPago(tarjeta1);
                    System.out.println("Pago aceptado. Muchas gracias");
                }else {
                    System.out.println("los datos de tu tarjeta son incorrectos");
                }

                break;

            case "PAYPAL":
                System.out.println("Introduce tu correo electronico");
                String correo = sc.nextLine();
                Paypal paypal1 = new Paypal(correo);
                System.out.println("introduce el importe a pagar");
                double importe = sc.nextDouble();
                System.out.println("validando paypal...");
                if (paypal1.validarPaypal(importe)){
                    paypal1.procesarPago(importe);
                    System.out.println("Pago aceptado.Muchas gracias");
                }else {
                    System.out.println("correo incorrecto o saldo no valido");
                }

                break;

            default:
                System.out.println("La opcion es incorrecta");
                break;



        }
    }

}

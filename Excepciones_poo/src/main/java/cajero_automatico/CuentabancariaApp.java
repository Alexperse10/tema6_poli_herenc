package cajero_automatico;

import java.util.Scanner;

public class CuentabancariaApp {
    public static void main(String[] args) throws DepositoMaximoException, LimiteDiarioException, SaldoInsuficienteExcepcion {
        Scanner sc = new Scanner(System.in);
        char opcion;
        Cuentabancaria cuentabancaria1 = new Cuentabancaria();

        do {
            System.out.println("=== cajero automatico ==");
            System.out.println("1. ingresar dinero");
            System.out.println("2. retirar dinero");
            System.out.println("3. consultar saldo");
            System.out.println("x. salir");
            System.out.print("selecciona una opcion: ");
            opcion = sc.next().charAt(0);

            try {
                switch (opcion) {
                    case '1':
                        System.out.println("cantidad a ingresar");
                        double ingreso = sc.nextDouble();
                        cuentabancaria1.ingresardinero(ingreso);
                        break;

                    case '2':
                        System.out.println("cantidad a retirar");
                        double retirar = sc.nextDouble();
                        cuentabancaria1.retirarsaldo(retirar);
                        break;

                    case '3':
                        System.out.println("consultar saldo");
                        cuentabancaria1.Consultarsaldo();
                        break;

                    case 'x':
                        System.out.println("saliendo del programa...");
                        break;

                    default:
                        System.out.println("opcion no valida");
                }
            } catch (RuntimeException e) {
                System.out.println("error "+e.getMessage());
            }


        } while (opcion != 'x');
    }

}

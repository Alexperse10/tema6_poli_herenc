package org.example;

import java.util.Scanner;

public class edad_app {
    public static void comprobarnumero(int numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException();
        }
    }

    public static void main(String[] args) throws NumeroNegativoException {
        Scanner sc = new Scanner(System.in);

            System.out.println("introduce un numero por consola");
            int numero = sc.nextInt();

            comprobarnumero(numero);

        }
    }


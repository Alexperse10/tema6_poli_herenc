package org.example;

public class CuentacorrienteApp {
    public static void main(String[] args) {
        Cuentacorriente cuentacorreinte1 = new Cuentacorriente("alex", "48652145q", 1542.0);
        Cuentacorriente cuentacorriente2 = new Cuentacorriente("alfred", "1455624q");

        System.out.println(cuentacorriente2);
        cuentacorriente2.ingresardinero(2564.7);
        System.out.println(cuentacorriente2);
        cuentacorriente2.ingresardinero(500.7);
        System.out.println(cuentacorriente2);
        cuentacorriente2.mostrarinfo();
        cuentacorriente2.sacardinero(555000000.0);

        Gestor gestor1 = new Gestor("alex", 54656656);

        gestor1.mostrarinfo();

        Cuentacorriente cuentacorriente3 = new Cuentacorriente("pedro","545454", gestor1);

        cuentacorriente3.mostrarinfo();
    }
}

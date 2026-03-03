package org.example;

public class Cuentacorriente {
    private String nombre;
    private String Dni;
    private double saldo;
    private Gestor gestor; // con esto lo que hago es crear un gestor que administra la cuenta corriente


    public Cuentacorriente(String nombre, String dni, double saldo ) {
        this.nombre = nombre;
        this.Dni = dni;
        this.saldo = saldo;

    }
    public Cuentacorriente(String nombre, String dni) { // sobrecarga del constructor
        this.nombre = nombre;
        this.Dni = dni;
        this.saldo =0;
    }
    public Cuentacorriente(String nombre, String dni, Gestor gestor) {
        this.nombre = nombre;
        this.Dni = dni;
        this.gestor = gestor;
    }



    public void sacardinero(double retirar) {
        if (saldo<0){
            System.out.println("lo siento no puedes retirar mas dinero del que tienes");
        }
        if (saldo<retirar){
            System.out.println("lo siento no puedes retirar mas saldo del que tienes disponible en la cuenta ");
        }

        saldo = saldo - retirar;

    }

    public void ingresardinero(double ingresar) {
        saldo = saldo + ingresar;
    }

    public void mostrarinfo() {
        System.out.println("==== mostrar informacion del cliente ====");
        if (gestor == null) {
            System.out.println("la cuenta no tiene gestor");
        } else {
            System.out.println("el cliente " + nombre + " con dni " + getDni() + " tiene un saldo de " + saldo + " el gestor es" + gestor.getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDni() {
        return Dni;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    @Override
    public String toString() {
        return "Cuentacorriente{" +
                "nombre='" + nombre + '\'' +
                ", Dni='" + Dni + '\'' +
                ", saldo=" + saldo +
                '}';
    }



}

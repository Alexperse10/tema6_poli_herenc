package org.example;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronizar() {
        System.out.println("sincronizando el televisor con control remoto...");
    }

    @Override
    public void encender() {
        System.out.println("encendiendo el televisor");
if (isEstado()){
    System.out.println("el televisor ya esta encendido");
}else {
    setEstado(true);
    System.out.println("Encendiendo televisor");
}

    }
}

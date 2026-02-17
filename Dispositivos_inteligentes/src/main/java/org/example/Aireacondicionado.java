package org.example;

public class Aireacondicionado extends Dispositivo implements ControlRemoto{


    public Aireacondicionado(String nombre) {
        super(nombre);

    }

    @Override
    public void sincronizar() {
        System.out.println("sincronizando aire acondicionado con control remoto");
    }

    @Override
    public void encender() {
        if (isEstado()){
            System.out.println("el aire acondicionado ya esta encendido");
        }else {
            setEstado(true);
            System.out.println("Encendiendo aire acondicionado");
        }
    }
}

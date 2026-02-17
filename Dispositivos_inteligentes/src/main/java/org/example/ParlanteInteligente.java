package org.example;

public class ParlanteInteligente extends Dispositivo{

    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (isEstado()) {
            System.out.println("el parlante ya esta encendido");
        }else {
            setEstado(true);
            System.out.println("Actyivando el parlante con control de voz");
        }
    }
}

package org.example;

import java.util.Random;

public class Bizum extends MetodoPago{
    private String telefono;
    private int pin;


    public Bizum(String telefono) {
        this.telefono = telefono;
        String pin_aleat = "";
        Random aleatorio = new Random();
        for (int i =0; i<6; i++){
            int digito = aleatorio.nextInt(10);
            pin_aleat += digito; // va concatenando

        }
        this.pin = Integer.parseInt(pin_aleat);
        System.out.println("[Chivato Pin]: "+pin_aleat);

    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+ " € con bizum");
    }

    public boolean validarbizum(String pin_usuario) {


        if (telefono.length() != 9 || !telefono.matches("\\d{9}") || !pin_usuario.matches("\\d{6}")){
            return false;
        }

        return pin_usuario.equalsIgnoreCase(String.valueOf(pin));

    }

    public int getPin() {
        return pin;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }
}

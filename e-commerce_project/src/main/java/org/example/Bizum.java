package org.example;

import java.util.Random;
/**
 * Clase que representa el método de pago Bizum.
 *
 * Genera un PIN aleatorio y valida el teléfono y el PIN introducido por el usuario.
 */

public class Bizum extends MetodoPago{
    /** Teléfono asociado al Bizum de nueve digitos. */
    private String telefono;
    /** PIN generado aleatoriamente  */
    private int pin;
    /**
     * Constructor del Bizum.
     *
     * Genera un PIN aleatorio de 6 dígitos y lo imprime para poder introducirlo y que sea igual.
     *
     * @param telefono número de teléfono del usuario
     */

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
    /**
     * Procesa el pago mediante Bizum.
     *
     * @param importe cantidad de dinero que se desea pagar
     */

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+ " € con bizum");
    }
    /**
     * Valida los datos del Bizum.
     *
     * Comprueba:teléfono con 9 dígitos, PIN con 6 dígitos, PIN introducido igual al PIN generado
     *
     * @param pin_usuario PIN introducido por el usuario
     * @return true si los datos son correctos, false en caso contrario
     */

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

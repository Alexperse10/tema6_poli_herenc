package org.example;

/**
 * Clase que representa el método de pago PayPal.
 *
 * Hereda de MetodoPago e implementa la validación del correo
 * y la comprobación de saldo suficiente.
 */

public class Paypal extends MetodoPago{
    /** Correo electrónico asociado a la cuenta PayPal. */
    private String cuenta;
    /** Saldo disponible en la cuenta PayPal. */
    private double saldo;

    /**
     * Constructor de Paypal.
     *
     * @param cuenta correo electrónico del usuario
     */

    public Paypal(String cuenta) {
        this.cuenta = cuenta;
        this.saldo =23;
    }
    /**
     * Procesa el pago mediante PayPal.
     *
     * @param importe cantidad de dinero que se debe pagar
     */

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago "+importe+" € con paypal");
    }

    /**
     * Valida la cuenta PayPal y comprueba que el saldo sea suficiente.
     *
     * @param importe importe que se desea pagar
     * @return true si el pago es válido, false en caso contrario
     */

    public boolean validarPaypal(double importe) {
        if (!cuenta.matches("^[A-Za-z0-9+_.-]+@alu.edu.gva.es$") || importe>saldo || importe<=0){
            return false;
        }
        return true;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Paypal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

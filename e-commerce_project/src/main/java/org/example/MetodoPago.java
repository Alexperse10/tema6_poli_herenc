package org.example;

/**
 * Clase abstracta que representa un método de pago general.
 *
 * Esta clase sirve para todos los métodos de pago disponibles
 * en la aplicación como TarjetaCredito, Paypal y Bizum.
 *
 * Se aplica abstracción y permite el uso de polimorfismo en la clase Tienda.
 */

public abstract class MetodoPago {

    /**
     * Procesa el pago del importe indicado.
     *
     * Cada clase hija implementará este método de forma diferente.
     *
     * @param importe cantidad de dinero que se va a pagar
     */


    public abstract void procesarPago(double importe);

}

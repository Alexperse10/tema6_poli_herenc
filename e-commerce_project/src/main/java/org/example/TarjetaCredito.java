package org.example;

/**
 * Clase que representa el pago mediante tarjeta de crédito.
 *
 * Hereda de MetodoPago y utiliza la lógica necesaria para validar
 * y procesar pagos con tarjeta.
 */

public class TarjetaCredito extends MetodoPago{
/** Número de tarjeta del usuario */
     private String nro_tarjeta;
    /** Tipo de tarjeta permitido: VISA, MASTERCARD o MAESTRO. */
     private String tipo;

    /**
     * Constructor de TarjetaCredito.
     *
     * @param nro_tarjeta número de tarjeta introducido por el usuario
     * @param tipo tipo de tarjeta VISA, MASTERCARD o MAESTRO
     */
     public TarjetaCredito(String nro_tarjeta, String tipo) {
         this.nro_tarjeta = nro_tarjeta;
         this.tipo = tipo;

     }
    /**
     * Procesa el pago mediante tarjeta de crédito.
     *
     * @param importe cantidad de dinero que se desea pagar
     */

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " +importe +" € con tarjeta de credito "+tipo);
    }

    /**
     * Valida los datos de la tarjeta.
     *
     * Comprueba:que el número tenga 16 dígitos, que el número sea numérico y que el tipo sea válido
     *
     * @return true si la tarjeta es válida, false en caso contrario
     */

    public boolean validarTarjeta() {
        if (nro_tarjeta.length() != 16 || !nro_tarjeta.matches ("\\d{16}") || !tipo.equalsIgnoreCase("VISA") && !tipo.equalsIgnoreCase("MASTERCARD") && !tipo.equalsIgnoreCase("MAESTRO")){
            return false;

        }
        return true;
    }
    /**
     * Modifica el tipo de tarjeta.
     *
     * @param tipo nuevo tipo de tarjeta
     */

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

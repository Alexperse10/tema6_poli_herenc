package org.example;

public class TarjetaCredito extends MetodoPago{
     private String nro_tarjeta;
     private String tipo;



    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " +importe +"€ con tarjeta de credito visa");
    }

    public String validarTarjeta() {
        return "";
    }
}

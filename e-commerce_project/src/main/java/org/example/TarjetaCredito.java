package org.example;

public class TarjetaCredito extends MetodoPago{
     private String nro_tarjeta;
     private String tipo;

     public TarjetaCredito(String nro_tarjeta, String tipo) {
         this.nro_tarjeta = nro_tarjeta;
         this.tipo = tipo;

     }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " +importe +" € con tarjeta de credito "+tipo);
    }

    public boolean validarTarjeta() {
        if (nro_tarjeta.length() != 16 || !nro_tarjeta.matches ("\\d{16}") || !tipo.equalsIgnoreCase("VISA") && !tipo.equalsIgnoreCase("MASTERCARD") && !tipo.equalsIgnoreCase("MAESTRO")){
            return false;

        }
        return true;
    }

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

package org.example;

public class Paypal extends MetodoPago{
    private String cuenta;
    private double saldo;

    public Paypal(String cuenta) {
        this.cuenta = cuenta;
        this.saldo =23;
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago "+importe+" € con bizum");
    }

    public boolean validarPaypal() {
        if (!cuenta.matches("^[A-Za-z0-9+_.-]+@alu.edu.gva.es$") || saldo<23){
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

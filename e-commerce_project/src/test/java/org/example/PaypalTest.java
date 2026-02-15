package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaypalTest {

    @Test
    public void paypalCorrecto() {
        Paypal paypal1 = new Paypal("usuario@alu.edu.gva.es");
        assertTrue(paypal1.validarPaypal(10));
    }

    @Test
    public void correoIncorrecto() {
        Paypal paypal2 = new Paypal("usuario@gmail.com");
        assertFalse(paypal2.validarPaypal(10));
    }

    @Test
    public void saldoInsuficiente() {
        Paypal paypal3 = new Paypal("usuario@alu.edu.gva.es");
        assertFalse(paypal3.validarPaypal(50));
    }

    @Test
    public void importeCero() {
        Paypal paypal4 = new Paypal("usuario@alu.edu.gva.es");
        assertFalse(paypal4.validarPaypal(0));
    }

    @Test
    public void importeNegativo() {
        Paypal paypal5 = new Paypal("usuario@alu.edu.gva.es");
        assertFalse(paypal5.validarPaypal(-5));
    }

    @Test
    public void paypalConSaldoModificado() {
        Paypal paypal6 = new Paypal("usuario@alu.edu.gva.es");
        paypal6.setSaldo(100);
        assertTrue(paypal6.validarPaypal(50));
    }
}

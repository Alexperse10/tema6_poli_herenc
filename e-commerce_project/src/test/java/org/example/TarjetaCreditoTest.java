package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TarjetaCreditoTest {

    @Test
    public void tarjetaCorrecta() {
        TarjetaCredito t = new TarjetaCredito("1234567891234567", "VISA");
        assertTrue(t.validarTarjeta());
    }

    @Test
    public void tarjetaLongitudIncorrecta() {
        TarjetaCredito t = new TarjetaCredito("12345", "VISA");
        assertFalse(t.validarTarjeta());
    }

    @Test
    public void tarjetaConLetras() {
        TarjetaCredito t = new TarjetaCredito("1234ABCD91234567", "VISA");
        assertFalse(t.validarTarjeta());
    }

    @Test
    public void tipoTarjetaIncorrecto() {
        TarjetaCredito t = new TarjetaCredito("1234567891234567", "AMEX");
        assertFalse(t.validarTarjeta());
    }

    @Test
    public void tipoTarjetaMaestroCorrecto() {
        TarjetaCredito t = new TarjetaCredito("1234567891234567", "MAESTRO");
        assertTrue(t.validarTarjeta());
    }

    @Test
    public void tipoTarjetaMastercardCorrecto() {
        TarjetaCredito t = new TarjetaCredito("1234567891234567", "MASTERCARD");
        assertTrue(t.validarTarjeta());
    }
}

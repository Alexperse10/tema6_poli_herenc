package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BizumTest {

    @Test
    public void bizumTelefonoCorrectoPinCorrecto() {
        Bizum bizum1 = new Bizum("612345678");
        String pinCorrecto = String.valueOf(bizum1.getPin());
        assertTrue(bizum1.validarbizum(pinCorrecto));
    }

    @Test
    public void telefonoIncorrectoLongitud() {
        Bizum bizum2 = new Bizum("12345");
        String pinCorrecto = String.valueOf(bizum2.getPin());
        assertFalse(bizum2.validarbizum(pinCorrecto));
    }

    @Test
    public void telefonoConLetras() {
        Bizum bizum3 = new Bizum("61A34567B");
        String pinCorrecto = String.valueOf(bizum3.getPin());
        assertFalse(bizum3.validarbizum(pinCorrecto));
    }

    @Test
    public void pinIncorrecto() {
        Bizum bizum4 = new Bizum("612345678");
        assertFalse(bizum4.validarbizum("111111"));
    }

    @Test
    public void pinConMenosDe6Digitos() {
        Bizum bizum5 = new Bizum("612345678");
        assertFalse(bizum5.validarbizum("123"));
    }

    @Test
    public void pinConLetras() {
        Bizum bizum6 = new Bizum("612345678");
        assertFalse(bizum6.validarbizum("12A45B"));
    }
}

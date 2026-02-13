package org.example;

public class validar_pin {

    public boolean validar_pin_(String pin) {
        if (pin == null) {
            return false;
        }
        if (pin.length() != 6){
            return false;
        }
        if (!pin.matches("\\d+")){
            return false;
        }
        return true;
        }
    }


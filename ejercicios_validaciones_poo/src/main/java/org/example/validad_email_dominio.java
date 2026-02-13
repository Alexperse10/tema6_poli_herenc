package org.example;

public class validad_email_dominio {

    public boolean validar_dominio(String dominio) {
        if (dominio == null) {
            return false;
        }
        return dominio.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
}

package org.example;

public class validar_email_match {

    public boolean validaremail (String email) {
        if (email == null || email.isEmpty()){
            return false;
        }
        return (email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"));
    }
 }

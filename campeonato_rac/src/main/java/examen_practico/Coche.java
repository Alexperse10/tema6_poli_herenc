package examen_practico;

import java.util.ArrayList;

public class Coche {
    private String modelo;
    private int potencia;
    private String matricula;


    public Coche(String modelo, int potencia, String matricula) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.matricula = matricula;

    }

    public void derrapar() {
        System.out.println("el coche" +getModelo()+ "con potencia "+getPotencia());
    }



    public String getModelo() {
        return modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", potencia=" + potencia +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}

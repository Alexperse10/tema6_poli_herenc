package org.example;

public class SintonizadorFM {
    private double frecuencia;

    public SintonizadorFM(double frecuencia) { // en este constructor puedo meterle el valor que yo quiero
        if (frecuencia < 80) {
            this.frecuencia = 180;
        }
        if (frecuencia > 180) {
            this.frecuencia = 80;
        }
    }

    public SintonizadorFM(){ // se inicia por defecto en 80 si no meto ningun valor
        this.frecuencia = 80;
    }

    public double up(){
        frecuencia = frecuencia + 0.5;
        if (frecuencia>180){
            return frecuencia=80;
        }
        return frecuencia;
    }

    public double down() {
        frecuencia = frecuencia - 0.5; // se realiza asi para que la variable se guarde fuera del metodo

        if (frecuencia<80) {
            return frecuencia = 180;
        }
        return frecuencia;
    }

    public void mostrarinfo() {
        System.out.println("frecuencia actual" +frecuencia);
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return "SintonizadorFM{" +
                "frecuencia=" + frecuencia +
                '}';
    }
}

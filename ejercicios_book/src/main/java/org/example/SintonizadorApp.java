package org.example;

public class SintonizadorApp {
    public static void main(String[] args) {

        SintonizadorFM sintonizadorFM1 = new SintonizadorFM(70);
        sintonizadorFM1.mostrarinfo();
        sintonizadorFM1.down();
        sintonizadorFM1.down();
        sintonizadorFM1.mostrarinfo();
        sintonizadorFM1.up();
        sintonizadorFM1.up();
        sintonizadorFM1.up();
        sintonizadorFM1.up();
        sintonizadorFM1.up();
        sintonizadorFM1.mostrarinfo();
    }
}

package ejercicio_aleatorio_abstract;

import java.util.ArrayList;

public class AppFiguras {
    public static void main(String[] args) {
        ArrayList<Figura> listafigura = new ArrayList<>();
        Figura circulo1 = new Circulo("circulo",25.4);
        Figura rectangulo1 = new Rectangulo("rectangulo", 12.5,23);
        Figura triangulo1 = new Triangulo("triangulo",41.6,85.7,96.3);

        listafigura.add(circulo1);
        listafigura.add(rectangulo1);
        listafigura.add(triangulo1);


        for (Figura figura : listafigura){
            figura.mostrarInfo();
            System.out.println("el area es: " +figura.calculararea());
            System.out.println("perimetro: "+figura.calcularperimetro());
            System.out.println("--------------------------------------");


        }
    }
}

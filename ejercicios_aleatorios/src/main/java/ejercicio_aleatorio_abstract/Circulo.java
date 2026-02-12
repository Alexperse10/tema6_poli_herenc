package ejercicio_aleatorio_abstract;

public class Circulo extends Figura{
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }



    @Override
    public double calculararea() {
        return Math.PI*radio*radio;
    }

    @Override
    public double calcularperimetro() {
        return 2*Math.PI*radio ;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }
}

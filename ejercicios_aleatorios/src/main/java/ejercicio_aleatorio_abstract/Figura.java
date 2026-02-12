package ejercicio_aleatorio_abstract;

public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Imprime figura: " +nombre);
    }

    public abstract  double calculararea();

    public abstract double calcularperimetro ();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

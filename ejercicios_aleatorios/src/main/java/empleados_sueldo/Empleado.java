package empleados_sueldo;

public class Empleado {
    private String nombre;
    private double salariobase;

    public Empleado(String nombre, double salariobase) {
        this.nombre = nombre;
        this.salariobase = salariobase;

    }
    public double calcularsalariobase() {
            return salariobase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salariobase=" + salariobase +
                '}';
    }
    public String gettipo() {
        return "Empleado";
    }
}

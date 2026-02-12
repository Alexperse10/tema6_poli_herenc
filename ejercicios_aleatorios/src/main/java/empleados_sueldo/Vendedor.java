package empleados_sueldo;

public class Vendedor extends Empleado {

    private static int comision=300;

    public Vendedor(String nombre, double salariobase) {
        super(nombre, salariobase);

    }

    @Override
    public double calcularsalariobase() {
        return super.calcularsalariobase() + comision;
    }

    public static int getComision() {
        return comision;
    }

    public static void setComision(int comision) {
        Vendedor.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String gettipo() {
        return "vendedor";
    }
}

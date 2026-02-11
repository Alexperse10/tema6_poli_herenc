package empleados_sueldo;

public class Gerente extends Empleado {
    private int comisionplus;

    public Gerente(String nombre, double salariobase) {
        super(nombre, salariobase);
        this.comisionplus = 554;
    }

    @Override
    public double calcularsalariobase() {
        return super.calcularsalariobase() + comisionplus;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String gettipo() {
        return "gerente";
    }
}

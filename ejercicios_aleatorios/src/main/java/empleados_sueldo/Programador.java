package empleados_sueldo;

public class Programador extends Empleado {
    private static int bonus = 200;

    public Programador(String nombre, double salariobase) {
        super(nombre, salariobase);

    }

    @Override
    public double calcularsalariobase() {
        return super.calcularsalariobase() + bonus;
    }

    public static int getBonus() {
        return bonus;
    }

    public static void setBonus(int bonus) {
        Programador.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String gettipo() {
        return "Programador";
    }
}

package platafroma_streaming;

public class PlanFamiliar extends Suscripcion{


    public PlanFamiliar(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerbeneficios() {
        System.out.println("Acceso para varios perfiles simultaneamente en alta definicion");
    }

    @Override
    public void obtenerperiododeprueba() {
        System.out.println("planfamiliar: 7 dias de prueba para cuantas nuevas");
    }

}

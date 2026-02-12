package platafroma_streaming;

public class PlanPremium extends Suscripcion{

    public PlanPremium(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerbeneficios() {
        System.out.println("Acceso a todo el contenido en alta defininicon y descargas");
    }

    @Override
    public void obtenerperiododeprueba() {


        System.out.println("planpremium: 14 dias de prueba gratuita");

    }

}

package platafroma_streaming;

public class PlanBasico extends Suscripcion{

    public PlanBasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerbeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estandar sin anuncios");
    }

    @Override
    public void obtenerperiododeprueba() {
        System.out.println("planbasico: 30 dias de prueba gratuita");
    }
}

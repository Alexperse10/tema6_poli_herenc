package platafroma_streaming;

public class Plangratis extends Suscripcion{


    public Plangratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerbeneficios() {

        System.out.println("Acceso limitado con anuncios");
    }

    @Override
    public void obtenerperiododeprueba() {
        System.out.println("plan gratis: sin periodo de prueba");
    }

}

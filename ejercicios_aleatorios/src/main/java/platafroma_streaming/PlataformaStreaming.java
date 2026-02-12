package platafroma_streaming;

import java.util.ArrayList;

public class PlataformaStreaming {
    public static void main(String[] args) {
        ArrayList<Suscripcion> listasuscripcion = new ArrayList<>();
        Suscripcion plangratis1 = new Plangratis("freeplan",0.0);
        Suscripcion planbasico1 = new PlanBasico("basicplan", 874);
        Suscripcion planpremium1 = new PlanPremium("niceplan", 965);
        Suscripcion planfamiliar1 = new PlanFamiliar("family", 1457);
        listasuscripcion.add(planfamiliar1);
        listasuscripcion.add(planbasico1);
        listasuscripcion.add(planpremium1);
        listasuscripcion.add(plangratis1);

        for (Suscripcion suscripcion : listasuscripcion){
            suscripcion.mostrinfo();
            suscripcion.obtenerbeneficios();
            suscripcion.obtenerperiododeprueba();
        }


    }

}

package examen_practico;

import java.util.ArrayList;

public class Carrera implements Accionescarrera{
    private String nombreCarrera;
    private ArrayList<Piloto> listapilotos;

    public Carrera(String nombrecarrera) {
        this.nombreCarrera = nombrecarrera;
        this.listapilotos = new ArrayList<>();
    }

    public void añadirpilotos(Piloto piloto) throws DorsalDuplicado {
        for (Piloto piloto_ : listapilotos) {
            if (piloto_.getDorsal() == piloto.getDorsal()) {
                throw new DorsalDuplicado();
            }

            listapilotos.add(piloto);
        }
    }

    public void  mostrarclasificacion(){
        for (Piloto piloto : listapilotos) {
            System.out.println(piloto.getDorsal()+ " puntos "+piloto.getPuntos());
        }
    }

    public Piloto obtenerganador() {
        if (listapilotos.isEmpty()) {
            System.out.println("No hay pilotos.");
            return null;
        }
        Piloto ganador = listapilotos.get(0);
        for (Piloto piloto : listapilotos) {
            if (piloto.getPuntos()> ganador.getPuntos()){
                ganador = piloto;
            }
        }
        return ganador;

    }



    @Override
    public void iniciarCarrera() {
        System.out.println("todos los pilotos estan comppitiendo");
        for (Piloto piloto : listapilotos) {
            piloto.competir();
        }
    }

    @Override
    public void finalizarfCarrera() {
        System.out.println("finalidando carrera");
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public void setListapilotos(ArrayList<Piloto> listapilotos) {
        this.listapilotos = listapilotos;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombreCarrera='" + nombreCarrera + '\'' +
                ", listapilotos=" + listapilotos +
                '}';
    }
}

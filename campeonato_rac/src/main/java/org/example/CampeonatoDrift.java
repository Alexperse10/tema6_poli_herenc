package org.example;

import java.util.ArrayList;

public class CampeonatoDrift implements AccionesCarrera {

    private ArrayList<Participante> listaparticipante;


    public void añadirparticipante(Participante participante) {
        listaparticipante.add(participante);
    }

    public void iniciarcarrera(){

    }

    public ArrayList<Participante> getListaparticipante() {
        return listaparticipante;
    }

    @Override
    public void iniciarcarrea() {

    }

    @Override
    public void mostrarclasificacion() {

    }

    @Override
    public String toString() {
        return "CampeonatoDrift{" +
                "listaparticipante=" + listaparticipante +
                '}';
    }
}

package org.example;

import java.util.ArrayList;

public class tareaPP {
    public static void main(String[] args) {

        ArrayList<Empleado> listaempleado = new ArrayList<>();
        Empleado pedro = new Desarrollador();
        Empleado alex = new Diseñador();
        Empleado sonia = new Gerente();
        listaempleado.add(pedro);
        listaempleado.add(alex);
        listaempleado.add(sonia);

        System.out.println("=== Ussando el array polimorfico ===");

        for (Empleado empleado : listaempleado){
            empleado.realizartarea();
        }
        pedro.realizartarea();
        alex.realizartarea();
        sonia.realizartarea();
        System.out.println("====usando el metodo asignar tarea.====");
        asignartarea(pedro);
        asignartarea(alex);

    }
    public static void asignartarea (Empleado empleado) {
        System.out.println("asignar tarea al empleado...");
        empleado.realizartarea();
    }
}
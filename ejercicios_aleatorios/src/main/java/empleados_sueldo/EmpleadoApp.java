package empleados_sueldo;

import java.util.ArrayList;
public class EmpleadoApp {
    public static void main(String[] args) {

        ArrayList<Empleado> listaempleado = new ArrayList<>();
        Empleado programador1 = new Programador("alex", 54645);
        Empleado programador2 = new Programador("juan", 25654);
        Empleado vendedor1 = new Vendedor("luis", 54545);
        Empleado vendedor2 = new Vendedor("angel", 56654654);
        Empleado gerente1 = new Gerente("raul", 897894);

        listaempleado.add(programador1);
        listaempleado.add(programador2);
        listaempleado.add(vendedor1);
        listaempleado.add(vendedor2);
        listaempleado.add(gerente1);

        for (Empleado empleado : listaempleado) {

            System.out.println(empleado.calcularsalariobase());
            System.out.println("el tipo de empleado es: "+empleado.gettipo());

        }



    }

}
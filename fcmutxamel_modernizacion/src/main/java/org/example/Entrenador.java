package org.example;

public class Entrenador extends Mutxamelfc implements AccionesDeportivas{
    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(Equipos equipo, String formacionPreferida, String nombre, int edad) throws FormatoCorrecto {
        super(nombre, edad);


        if (!formacionPreferida.matches("\\d-\\d-\\d")){
            throw new FormatoCorrecto();
        }
        this.formacionPreferida = formacionPreferida;
        this.equipo = equipo;
    }



    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void planificarEntrenamiento() {
        System.out.println("el entrandor "+getNombre()+ " esta entrenando al equipo "+getEquipo());
    }

    public void hacerCambios() {
        System.out.println("el entrenador ha hecho un cambio "+Equipos.CADETE );
    }


    @Override
    public void entrenar() {
        System.out.println("el entrador "+getNombre()+ " esta entrenando");
    }

    @Override
    public void jugarPartido(String rival) {

    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar(String ciudad) {

    }

    @Override
    public void celebrar() {

    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }
}

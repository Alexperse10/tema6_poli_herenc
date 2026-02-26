package org.example;
/**
 * Clase que representa al entrenador del equipo.
 * Hereda de Mutxamelfc e implementa AccionesDeportivas.
 * Tiene un equipo asignado y una formacion preferida (ej: 4-3-3).
 */
public class Entrenador extends Mutxamelfc implements AccionesDeportivas{
    /** equipo al que entrena */
    private Equipos equipo;
    /** formacion tactica que prefiere usar */
    private String formacionPreferida;
    /**
     * Constructor del entrenador
     * Comprueba que la formacion tenga formato correcto (numero-numero-numero)
     * @param equipo equipo que entrena
     * @param formacionPreferida formacion tipo 4-3-3
     * @param nombre nombre del entrenador
     * @param edad edad del entrenador
     * @throws FormatoCorrecto si la formacion no tiene el formato adecuado
     */

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
    /** el entrenador planifica el entrenamiento */
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

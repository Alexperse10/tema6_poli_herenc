package org.example;

public class PilotoProfesional extends Piloto{
        private String patricinador;

    public PilotoProfesional(String nombre, int edad, int puntostotales, String patrocinador,String coche, String matricula, Niveldificultad nivel) throws Formatoincorrexc, EdadinvalidExc {
        super(nombre, edad,puntostotales,coche,matricula,nivel);
        this.patricinador = patrocinador;
    }




    //@Override
    //public int calcularRendimiento() {
        //super.calcularRendimiento();
        //return
    //}

    public String getPatricinador() {
        return patricinador;
    }

    public void setPatricinador(String patricinador) {
        this.patricinador = patricinador;
    }

    @Override
    public String toString() {
        return "PilotoProfesional{" +
                "patricinador='" + patricinador + '\'' +
                '}';
    }
}

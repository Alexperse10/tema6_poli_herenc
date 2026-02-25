package org.example;

public class Presentador extends MutxaAwards{

    private String nombre;

    public Presentador(int edicion, String nombre) {
        super(edicion);
        this. nombre = nombre;
    }

    @Override
    public void obtenerdetalles() {

    }

    public void presentar() {

    }

    public void entregarpremio(Premio premio){

    }

    @Override
    public int getEdicion() {
        return super.getEdicion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Presentador{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

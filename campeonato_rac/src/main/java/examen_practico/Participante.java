package examen_practico;

public abstract class Participante {
    private String nombre;
    private int edad;

    public Participante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad= edad;
    }

    public abstract void presentarse();

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

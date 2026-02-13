package org.example;

public class comprobar_pin {
    private String pingenerado;
    private String pinusuario;

    public comprobar_pin(String pingenerado, String pinusuario) {
        this.pingenerado = pingenerado;
        this.pinusuario = pinusuario;
    }

    public static boolean comprobarpin (String pingenerado, String pinusuario) {
        if (!pingenerado.equalsIgnoreCase(pinusuario)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

       comprobar_pin pin1 = new comprobar_pin("123456","123456");
       System.out.println(pin1);

    }

    @Override
    public String toString() {
        return "comprobar_pin{" +
                "pingenerado='" + pingenerado + '\'' +
                ", pinusuario='" + pinusuario + '\'' +
                '}';
    }
}

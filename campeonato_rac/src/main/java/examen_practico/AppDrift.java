package examen_practico;

public class AppDrift {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carrera carrera = new Carrera("Drift Mutxamel Racing");

        int opcion;

        do {
            System.out.println("\n=== DRIFT MUTXAMEL RACING ===");
            System.out.println("1. Añadir piloto");
            System.out.println("2. Mostrar pilotos");
            System.out.println("3. Iniciar carrera");
            System.out.println("4. Mostrar clasificación");
            System.out.println("5. Mostrar ganador");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    try {
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Edad: ");
                        int edad = sc.nextInt();

                        System.out.print("Dorsal: ");
                        int dorsal = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Categoria (PRO, SEMIPRO, AMATEUR): ");
                        Categoria categoria = Categoria.valueOf(sc.nextLine().toUpperCase());

                        System.out.print("Modelo coche: ");
                        String modelo = sc.nextLine();

                        System.out.print("Potencia: ");
                        int potencia = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Matricula: ");
                        String matricula = sc.nextLine();

                        Coche coche = new Coche(modelo, potencia, matricula);
                        Piloto piloto = new Piloto(nombre, edad, dorsal, categoria, coche);

                        carrera.añadirPiloto(piloto);

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    carrera.mostrarClasificacion();
                    break;

                case 3:
                    carrera.iniciarCarrera();
                    break;

                case 4:
                    carrera.mostrarClasificacion();
                    break;

                case 5:
                    Piloto ganador = carrera.obtenerGanador();
                    if (ganador != null) {
                        System.out.println("🏆 Ganador: " + ganador.getNombre());
                    } else {
                        System.out.println("No hay ganador.");
                    }
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }

}

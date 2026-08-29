public class Main {
    public static void main(String[] args) {

        System.out.println("===== ESTUDIANTES =====");
        Estudiante e1 = new Estudiante(); // constructor por defecto
        Estudiante e2 = new Estudiante("Laura Gómez", 21, "Ingeniería de Sistemas"); // parametrizado
        e1.mostrarInfo();
        e2.mostrarInfo();
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("===== ESTUDIANTES =====");
        Estudiante e1 = new Estudiante(); // constructor por defecto
        Estudiante e2 = new Estudiante("Laura Gómez", 21, "Ingeniería de Sistemas"); // parametrizado
        e1.mostrarInfo();
        e2.mostrarInfo();

        //Profesor se crean ambos profesores con el mismo constructor
        System.out.println("\n===== PROFESOR =====");
        Profesor p1 = new Profesor("William Arturo Gil", 3500000);
        Profesor p2 = new Profesor("Kellyn Rodriguez", 2800000);
        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}

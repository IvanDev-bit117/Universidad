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
        //curso c1, c2, c3 usan constructores distintos pero todos terminan llamadno al completo
        System.out.println("\n===== CURSOS =====");
        Curso c1 = new Curso("Programación I");                       // constructor 1 (solo nombre)
        Curso c2 = new Curso("Bases de Datos", 30);                   // constructor 2 (nombre + cupos)
        Curso c3 = new Curso("Estructuras de Datos", 25, "Carlos Ruiz"); // constructor 3 (todos los datos)

        System.out.println();
        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo();
    }
}

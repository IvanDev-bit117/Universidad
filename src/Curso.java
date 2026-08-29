public class Curso {
    private String nombreCurso;
    private int cupos;
    private String profesorAsignado;

    //Constructor 1 recibe nombre del curso
    public Curso(String nombreCurso) {
        this(nombreCurso, 20); // le manda un valor fijo de 20 cupos al constructor 2
        System.out.println(">> Constructor 1: se asignó cupo por defecto (20)");
    }



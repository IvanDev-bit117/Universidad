public class Curso {
    private String nombreCurso;
    private int cupos;
    private String profesorAsignado;

    //Constructor 1 recibe nombre del curso
    public Curso(String nombreCurso) {
        this(nombreCurso, 20); // le manda un valor fijo de 20 cupos al constructor 2
        System.out.println(">> Constructor 1: se asignó cupo por defecto (20)");
    }

    // Constructor 2: recibe nombre y cupos mediante this
    public Curso(String nombreCurso, int cupos) {
        this(nombreCurso, cupos, "Sin profesor asignado"); // manda un profesor fijo
        System.out.println(">> Constructor 2: se asignó profesor por defecto");
    }

    // Constructor 3: el más completo, recibe los 3 datos
    public Curso(String nombreCurso, int cupos, String profesorAsignado) {
        // Aquí es donde realmente se guardan los valores en el objeto
        this.nombreCurso = nombreCurso;
        this.cupos = cupos;
        this.profesorAsignado = profesorAsignado;
        System.out.println(">> Constructor 3: datos completos asignados");
    }

    // Método
    public void mostrarInfo() {
        System.out.println("Curso: " + nombreCurso + " | Cupos: " + cupos + " | Profesor: " + profesorAsignado);
    }
}
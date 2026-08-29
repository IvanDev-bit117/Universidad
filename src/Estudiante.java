public class Estudiante {
        private String nombre="";
        private int edad=0;
        private String carrera"";

        // Constructor sin parámetros
        public Estudiante() {
            this.nombre = "Jorge Castañeda";
            this.edad = 21;
            this.carrera = "Ingenieria de Software";
            System.out.println(">> Se creó un Estudiante con el constructor POR DEFECTO");
        }
        // Constructor con parámetros sobrecargado
        public Estudiante(String nombre, int edad, String carrera) {
            this.nombre = nombre;
            this.edad = edad;
            this.carrera = carrera;
            System.out.println(">> Se creó un Estudiante con el constructor PARAMETRIZADO");
    }

        public void mostrarInfo() {
            System.out.println("Estudiante: " + nombre + " / Edad: " + edad + " / Carrera: " + carrera);
    }
}


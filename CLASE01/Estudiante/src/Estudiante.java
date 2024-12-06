public class Estudiante {
    // Definir atributos
    String nombre;
    int edad;
    double promedio;

    // Constructor
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Metodos
    public void mostrarPromedio() {
        System.out.println("Nombre " + nombre + ", Edad " + edad + ", Promedio " + promedio);
    }

    public boolean esAprobado() {
        return promedio >= 3.0;
    }
}

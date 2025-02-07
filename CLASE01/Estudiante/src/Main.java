import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Lista de Estudiantes
        List<Student> estudiantes = new ArrayList<>();
        estudiantes.add(new Student("Jeferson", 28, 4.8));
        estudiantes.add(new Student("John", 18, 4.5));
        estudiantes.add(new Student("Ana", 26, 4.2));
        estudiantes.add(new Student("Marcela", 27, 2.9));

        // Mostrar Informacion estudiante
        for (Student estudiante : estudiantes) {
            estudiante.mostrarPromedio();
            if (estudiante.esAprobado()) {
                System.out.println("Estado: Aprobado");
            } else {
                System.out.println("Estado: No Aprobado");
            }
            System.out.println();

        }

    }
}

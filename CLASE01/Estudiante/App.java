package CLASE01.Ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Lista de Estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Jeferson", 28, 4.8));
        estudiantes.add(new Estudiante("John", 18, 4.5));
        estudiantes.add(new Estudiante("Ana", 26, 4.2));
        estudiantes.add(new Estudiante("Marcela", 27, 2.9));

        // Mostrar Informacion estudiante
        for (Estudiante estudiante : estudiantes) {
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

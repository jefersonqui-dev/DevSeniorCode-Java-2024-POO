public class PruebaEmployee {
    public static void main(String[] args) throws Exception {
        Employee empleado1 = new Employee("Jeferson", 12221, 2300000);
        Employee empleado2 = new Employee("Ana", 12222, 1300000);
        System.out.println(empleado1.toString());

        empleado1.increaseSalary(12);

        System.out.println(empleado1.toString());

        empleado1.setSalary(0);

        System.out.println(empleado1.toString());

        System.out.println(empleado1.hashCode());

        System.out.println(empleado2.hashCode());
    }
}

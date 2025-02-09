public class Main {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("Ford", "Mustang GT", 250, 2);
        Carro carro2 = new Carro("Porsche", "Taycan Turbo S", 322, 4);
        Carro carro3 = new Carro("BMW", "M8 Competition", 318, 2);
        Moto moto1 = new Moto("Ducati", "Panigale V4 R", 400, "No");
        Moto moto2 = new Moto("Harley-Davidson", "Road King", 120, "Opcional");
        Moto moto3 = new Moto("Triumph", "Bonneville T120", 120, "Si");

        Vehicle.mostrarDetalles();

        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        System.out.println(carro3.toString());
        System.out.println(moto1.toString());
        System.out.println(moto2.toString());
        System.out.println(moto3.toString());
    }
}

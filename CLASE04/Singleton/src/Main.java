import Singleton.src.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();

        logger1.log("Se Imprimio el Pasaporte");
        logger2.log("Se Imprimio la historia Clinica ");

        System.out.println(logger1);
        System.out.println(logger2);
    }
}

package CLASE01.Libro;

public class Main {
    public static void main(String[] args) {
        Book libro = new Book();// Instancia del objeto
        Book libro2 = new Book("Cien años de soledad", "Gabriel GM", 1987, "Narrativa");
        Book libro3 = new Book("Don Quijete de la mancha", "Miguel de Cervantes", 1996, "Literatura");
        libro3.getBook();
        System.out.println(" ***************************");
        libro.showInfo();
        System.out.println("****************************");
        libro2.showInfo();
        System.out.println("****************************");
        libro3.showInfo();
    }
}

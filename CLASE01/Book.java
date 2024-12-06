package CLASE01;

public class Book {
    // Definir atributos:
    String title;
    String author;
    int year;
    String gender;
    boolean isBusy;

    public Book() {

    }

    public Book(String title, String author, int year, String gender, boolean isBusy) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.isBusy = isBusy;
    }

    public Book(String title, String author, int year, String gender) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.isBusy = false;
    }

    public void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Gender: " + gender);
        System.out.println("IsBusy: " + isBusy);
    }

    public void getBook() {
        if (!isBusy) {
            isBusy = true;
            System.out.println("El libro: " + title + " ha sido prestado ");
        } else {
            System.out.println("El libro: " + title + " ya esta prestado");
        }
    }

    public void returnBook() {
        if (isBusy) {
            isBusy = false;
            System.out.println("El libro: " + title + " ha sido devuelto ");
        } else {
            System.out.println("El libro: " + title + " no esta prestado");
        }
    }

}

public class Cancion {
    // construccion del Molde - poniendo generalidades
    // programadores o diseñadores de la clase
    int id;
    String album;
    String nombre;
    String artista;
    int duracion;
    String genero;

    // crear una cancion
    // constructores
    public Cancion() {

    }

    // constructor
    public Cancion(String album, String nombre, String artista, String genero) {
        this.album = album;
        this.nombre = nombre;
        this.artista = artista; // atributo = parametro
    }

    // Consultar el valor de los atributos desde afuera
    // Hay metodos especiales para esto
    // Getters -------> get(obtener)

    public String getArtista() {
        return this.artista; // se puede poner solamente artista porque no hay ambieguedad con parametro
    }

    public String getAlbum() {
        return this.album;
    }

    // Los setters son Obligatorios: Permiten establecer los valores iniciales ->
    // set
    public void setArtista(String artista) {
        this.artista = artista; // Establece el valor de artista: editar
    }

    public boolean isValidArtista(String artista) {
        // validación
        // si es valido
        setArtista(artista);
        return true;

        // si no es valido
        // return false;
    }

}
public class Vehicle {
    private String marca;
    private String Modelo;
    private int velocidadMaxima;

    // constructor vacio

    public Vehicle() {
        System.out.println("Ejecutando Constructor");
    }

    public Vehicle(String marca, String Modelo, int velocidadMaxima) {
        this.marca = marca;
        this.Modelo = Modelo;
        this.velocidadMaxima = velocidadMaxima;
    }
    // Metodos geters y seters para cada atributo

    // Marca
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Modelo
    public String getModelo() {
        return this.Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    // Velocidad Maxima
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public static void mostrarDetalles() {
        System.out.println("\t\t\t\t\t\t Detalles de los vehiculos\n");
    }

    // Estado del objeto
    @Override
    public String toString() {
        return "Vehiculo [Marca = " + this.marca + ", Modelo = " + this.Modelo + ", Velocidad maxima = "
                + this.velocidadMaxima + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((Modelo == null) ? 0 : Modelo.hashCode());
        result = prime * result + velocidadMaxima;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehicle other = (Vehicle) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (Modelo == null) {
            if (other.Modelo != null)
                return false;
        } else if (!Modelo.equals(other.Modelo))
            return false;
        if (velocidadMaxima != other.velocidadMaxima)
            return false;
        return true;
    }

}

public class Moto extends Vehicle {
    private String tieneSidecar;

    public Moto(String Marca, String Modelo, int velocidadMaxima, String tieneSidecar) {
        super(Marca, Modelo, velocidadMaxima);
        this.tieneSidecar = tieneSidecar;
    }

    public String getTieneSideCar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(String tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public String toString() {
        return super.toString() + "[¿Tiene Sidecar? = " + tieneSidecar + ", Tipo = Moto]";

    }
}

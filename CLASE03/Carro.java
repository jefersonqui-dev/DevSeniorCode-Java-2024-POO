
public class Carro implements Vehiculo {

    @Override
    public void moverse() {
        System.out.println("Se mueve sobre 4 Ruedas");
    }

    @Override
    public int obtenerVelocidad() {
        return 120;
    }

    @Override
    public void cambiarMarcha(int cambio) {
        System.out.println("Se cambio a:" + cambio + "marcha");
    }

}

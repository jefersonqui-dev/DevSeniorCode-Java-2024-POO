public class Bitcoin implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Transfiriendo " + monto + " BTC a la red Bitcoin");

    }

    @Override
    public String obtenerDetalles() {
        return "Transferencia Realizado con Bitcoin";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto >= 0.001;
    }

}

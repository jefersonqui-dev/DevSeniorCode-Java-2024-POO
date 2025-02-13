public class TarjetaCredito implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito por: $" + monto);
    }

    @Override
    public String obtenerDetalles() {
        return "Pago realizado con tarjeta terminada en 1234";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0 && monto <= 1000;
    }

}

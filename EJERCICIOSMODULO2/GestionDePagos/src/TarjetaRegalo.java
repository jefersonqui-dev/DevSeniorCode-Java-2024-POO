public class TarjetaRegalo implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago Procesado con Tarjeta Regalo por un monto " + monto);
    }

    @Override
    public String obtenerDetalles() {
        return "Transferencia realizada con Tarjeta Regalo";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0 && monto <= 500;
    }

}

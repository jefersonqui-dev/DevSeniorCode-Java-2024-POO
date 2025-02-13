public class TransferenciaBancaria implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Se ha procesado la transferencia bancaria por: $" + monto);
    }

    @Override
    public String obtenerDetalles() {
        return "Se Realizo el pago con la Cuenta Bancaria: 987654321";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 10;
    }

}

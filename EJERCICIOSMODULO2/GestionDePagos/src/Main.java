import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MetodoPago> metodospago = new ArrayList<>();
        metodospago.add(new Bitcoin());
        metodospago.add(new TarjetaCredito());
        metodospago.add(new TarjetaRegalo());
        metodospago.add(new TransferenciaBancaria());

        // Montos a procesar
        double[] montos = { 100, 5000, 5, 0.002, 300 };

        for (MetodoPago metodopago : metodospago) {
            System.out.printf("%n\nMétodo de Pago: %s.", metodopago.obtenerDetalles());
            for (double monto : montos) {
                if (metodopago.validarMonto(monto)) {
                    metodopago.procesarPago(monto);
                } else {
                    System.out.printf("%nMonto no válido: %s.", monto);
                }
            }
        }

    }
}

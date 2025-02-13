# Gestion De Pagos

Este programa implementa un sistema extensible que gestiona multiples metodos de pago mediante el uso de una interfaz en java. El sistema soporta diferentes caracteristicas para cada método de pago, como validadcion de montos, procesamiento de pagos y la obtencion de detalles especificos.

## Implementación

1. Interfaz Metodo Pago

```
    void procesarPago(double monto); // Procesa un pago  y proporciona informacion de como se realiza
    String obtenerDetalles(); // Devuelve detalles especificos del metodo de pago
    boolean validarMonto(double monto);  // Valida si un monto es aceptable  segun las reglas del metodo de pago
```

2. Clases que Implementan la interfaz

```
    TarjetaCredito();
    TransferenciaBancaria();
    Bitcoin();
    TarjetaRegalo();
```

3. Clase Principal Main

   - Simula el uso del sistema, creando una lista de diferentes métodos de pago y procesando pagos con cada uno de ellos.
   - Valida montos antes de procesar un pago.
   - Imprime los detalles de cada metodo y el resultado de los pagos.

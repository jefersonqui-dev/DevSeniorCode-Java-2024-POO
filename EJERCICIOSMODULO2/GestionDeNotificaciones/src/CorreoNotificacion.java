public class CorreoNotificacion implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.printf("%nEnviando Correo: %s", mensaje);
    }

}

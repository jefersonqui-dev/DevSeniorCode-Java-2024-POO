public class Main {
    public static void main(String[] args) {

        Notificacion notificacion1 = NotificacionFactory.getNotificacion(TipoNotificacion.CORREO);
        notificacion1.enviar("Bienvenido a Nuestra Plataforma de pagos!");

        Notificacion notificacion2 = NotificacionFactory.getNotificacion(TipoNotificacion.SMS);
        notificacion2.enviar("Stellarium: Mira el tren de Satelites Starlink");

        Notificacion notificacion3 = NotificacionFactory.getNotificacion(TipoNotificacion.PUSH);
        notificacion3.enviar("Tienes una aplicacion con una nueva actualizacion");
    }
}

## Gestion de Notificaciones (Patron Factory)

En este proyecto se hace uso e implementacion del patro de Diseño Factory para la gestion de Notificaciones

# Objetivo

1. Crea implementaciones Concretas:

   - CorreoNotificacion: Imprime "Enviando correo: [Mensaje]".
   - SMS Notificacion: Imprime "Enviando SMS: [Mensaje]".
   - PushNotificacion: Imprime "Enviando notificacion Push: [Mensaje]".

2. Implementa una clase Factory NotificacionFactory que devuelva el canal adecuado según un parámetro.

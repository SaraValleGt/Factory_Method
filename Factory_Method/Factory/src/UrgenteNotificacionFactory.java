public class UrgenteNotificacionFactory implements NotificacionFactory {
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion(); // Implementación específica para notificaciones urgentes por email
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion(); // Implementación específica para notificaciones urgentes por SMS
    }
}



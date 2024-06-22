public class RegularNotificacionFactory implements NotificacionFactory {
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        // Implementación específica para notificaciones regulares por email
        return new EmailNotificacion();
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        // Implementación específica para notificaciones regulares por SMS
        return new SMSNotificacion();
    }
}

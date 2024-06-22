public class AppNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando notificación de app: " + mensaje);
        // Implementar lógica específica de envío de notificación de app
    }
}

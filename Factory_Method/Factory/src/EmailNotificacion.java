public class EmailNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
        // Implementar lógica específica de envío de email
    }
}

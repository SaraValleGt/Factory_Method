public class Main {
    public static void main(String[] args) {

        NotificacionFactory regularFactory = NotificacionFactoryCreator.crearFactory("regular");
        NotificacionFactory urgenteFactory = NotificacionFactoryCreator.crearFactory("urgente");


        EmailNotificacion regularEmail = regularFactory.crearEmailNotificacion();
        SMSNotificacion regularSMS = regularFactory.crearSMSNotificacion();

        regularEmail.enviarMensaje("Recordatorio: Reunión mañana");
        regularSMS.enviarMensaje("Recordatorio: Pago de factura");

        System.out.println();


        EmailNotificacion urgenteEmail = urgenteFactory.crearEmailNotificacion();
        SMSNotificacion urgenteSMS = urgenteFactory.crearSMSNotificacion();

        urgenteEmail.enviarMensaje("Urgente: Problema en el servidor");
        urgenteSMS.enviarMensaje("Urgente: Llame de inmediato");
    }
}

public class NotificacionFactoryCreator {
    public static NotificacionFactory crearFactory(String tipo) {
        switch (tipo) {
            case "urgente":
                return new UrgenteNotificacionFactory();
            case "regular":
                return new RegularNotificacionFactory();
            default:
                throw new IllegalArgumentException("Tipo de fábrica no soportado: " + tipo);
        }
    }
}


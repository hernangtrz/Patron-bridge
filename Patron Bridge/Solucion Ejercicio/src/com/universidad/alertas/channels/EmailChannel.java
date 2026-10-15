package com.universidad.alertas.channels;

/**
 * Concrete Implementor: Canal de envío por Correo Electrónico.
 */
public class EmailChannel implements NotificationChannel {
    private String emailAddress;

    public EmailChannel(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void send(String message) {
        System.out.println("[CANAL CORREO ELECTRONICO] Enviando a <" + emailAddress + ">");
        System.out.println("   Contenido:\n" + message);
    }
}

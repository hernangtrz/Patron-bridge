package com.universidad.alertas.channels;

/**
 * Concrete Implementor: Canal de envío por SMS.
 */
public class SMSChannel implements NotificationChannel {
    private String phoneNumber;

    public SMSChannel(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        System.out.println("[CANAL SMS] Enviando mensaje de texto a <" + phoneNumber + ">");
        System.out.println("   Contenido:\n" + message);
    }
}

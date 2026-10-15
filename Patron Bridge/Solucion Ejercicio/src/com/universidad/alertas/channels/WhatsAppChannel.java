package com.universidad.alertas.channels;

/**
 * Concrete Implementor: Canal de envío por WhatsApp (Reto 4).
 * Se integra directamente con cualquier tipo de alerta existente o futura.
 */
public class WhatsAppChannel implements NotificationChannel {
    private String phoneNumber;

    public WhatsAppChannel(String phoneNumber) {
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
        System.out.println("[CANAL WHATSAPP] Enviando mensaje a <" + phoneNumber + ">");
        System.out.println("   Contenido:\n" + message);
    }
}

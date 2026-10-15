package com.universidad.alertas.channels;

/**
 * Implementor (Implementador) del patrón Bridge.
 * Define la interfaz para los canales de envío de notificaciones.
 */
public interface NotificationChannel {
    void send(String message);
}

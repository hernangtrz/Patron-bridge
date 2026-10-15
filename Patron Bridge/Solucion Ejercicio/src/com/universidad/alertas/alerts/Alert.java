package com.universidad.alertas.alerts;

import com.universidad.alertas.channels.NotificationChannel;

/**
 * Abstraction (Abstracción) del patrón Bridge.
 * Mantiene una referencia al implementador (NotificationChannel)
 * y define la interfaz principal para las alertas.
 */
public abstract class Alert {
    // El "Puente" (Bridge) hacia el canal de comunicación
    protected NotificationChannel channel;

    public Alert(NotificationChannel channel) {
        this.channel = channel;
    }

    public NotificationChannel getChannel() {
        return channel;
    }

    /**
     * Permite cambiar dinámicamente el canal de envío en tiempo de ejecución.
     */
    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
    }

    /**
     * Envía la alerta formateada según su tipo a través del canal configurado.
     * @param message Mensaje o contenido de la alerta.
     */
    public abstract void send(String message);
}

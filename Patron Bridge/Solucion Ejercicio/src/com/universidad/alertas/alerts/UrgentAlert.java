package com.universidad.alertas.alerts;

import com.universidad.alertas.channels.NotificationChannel;

/**
 * Refined Abstraction: Alerta de tipo Urgente.
 * Agrega el formato, banderas de prioridad alta e instrucciones de emergencia.
 */
public class UrgentAlert extends Alert {

    public UrgentAlert(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        String formattedMessage = "   **************************************************\n"
                + "   [!!! ALERTA URGENTE - PRIORIDAD MAXIMA !!!]\n"
                + "   ATENCION INMEDIATA:\n"
                + "   \"" + message + "\"\n"
                + "   Por favor siga estrictamente los protocolos de seguridad.\n"
                + "   **************************************************";
        
        // Delega el envio al canal correspondiente a traves del Bridge
        channel.send(formattedMessage);
    }
}

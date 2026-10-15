package com.universidad.alertas.alerts;

import com.universidad.alertas.channels.NotificationChannel;

/**
 * Refined Abstraction: Alerta de tipo Academico.
 * Agrega el formato, tono y reglas de negocio propias del ambito academico.
 */
public class AcademicAlert extends Alert {

    public AcademicAlert(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        String formattedMessage = "   --------------------------------------------------\n"
                + "   [NOTIFICACION ACADEMICA - COMUNICADO OFICIAL]\n"
                + "   Estimada comunidad universitaria:\n"
                + "   \"" + message + "\"\n"
                + "   --------------------------------------------------";
        
        // Delega el envio al canal correspondiente a traves del Bridge
        channel.send(formattedMessage);
    }
}

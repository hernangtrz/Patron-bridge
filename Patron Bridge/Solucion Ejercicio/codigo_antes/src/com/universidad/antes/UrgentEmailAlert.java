package com.universidad.antes;

/**
 * Clase combinada rígidamente: Alerta Urgente enviada por Correo.
 * Problema: Duplica la lógica del canal correo de AcademicEmailAlert,
 * pero cambiando el formato de urgencia.
 */
public class UrgentEmailAlert extends Alert {
    private String email;

    public UrgentEmailAlert(String email) {
        this.email = email;
    }

    @Override
    public void send(String message) {
        System.out.println("[CORREO ELECTRONICO] Enviando a <" + email + ">");
        System.out.println("   [ALERTA URGENTE] ATENCION INMEDIATA: " + message);
    }
}

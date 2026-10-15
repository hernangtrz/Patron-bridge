package com.universidad.antes;

/**
 * Clase combinada rígidamente: Alerta Urgente enviada por SMS.
 * Problema: Duplica la lógica de UrgentEmailAlert y AcademicSMSAlert.
 */
public class UrgentSMSAlert extends Alert {
    private String phoneNumber;

    public UrgentSMSAlert(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        System.out.println("[SMS] Enviando a <" + phoneNumber + ">");
        System.out.println("   [ALERTA URGENTE] ATENCION INMEDIATA: " + message);
    }
}

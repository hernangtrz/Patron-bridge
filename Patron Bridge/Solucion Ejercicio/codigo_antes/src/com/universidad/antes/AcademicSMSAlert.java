package com.universidad.antes;

/**
 * Clase combinada rígidamente: Alerta Académica enviada por SMS.
 * Problema: Duplica el formato académico de AcademicEmailAlert,
 * pero cambiando únicamente la lógica del canal a SMS.
 */
public class AcademicSMSAlert extends Alert {
    private String phoneNumber;

    public AcademicSMSAlert(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        System.out.println("[SMS] Enviando a <" + phoneNumber + ">");
        System.out.println("   [ACADEMICA] Estimada comunidad universitaria: " + message);
    }
}

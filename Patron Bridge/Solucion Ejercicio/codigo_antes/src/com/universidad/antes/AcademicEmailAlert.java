package com.universidad.antes;

/**
 * Clase combinada rígidamente: Alerta Académica enviada por Correo.
 * Problema: Acopla la lógica académica con el canal de correo.
 */
public class AcademicEmailAlert extends Alert {
    private String email;

    public AcademicEmailAlert(String email) {
        this.email = email;
    }

    @Override
    public void send(String message) {
        System.out.println("[CORREO ELECTRONICO] Enviando a <" + email + ">");
        System.out.println("   [ACADEMICA] Estimada comunidad universitaria: " + message);
    }
}

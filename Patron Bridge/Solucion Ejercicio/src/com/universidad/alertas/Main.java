package com.universidad.alertas;

import com.universidad.alertas.alerts.AcademicAlert;
import com.universidad.alertas.alerts.Alert;
import com.universidad.alertas.alerts.UrgentAlert;
import com.universidad.alertas.channels.EmailChannel;
import com.universidad.alertas.channels.NotificationChannel;
import com.universidad.alertas.channels.SMSChannel;
import com.universidad.alertas.channels.WhatsAppChannel;

/**
 * Clase principal que demuestra el funcionamiento del Patron Bridge
 * para el Sistema de Alertas Universitarias.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================================");
        System.out.println("        SISTEMA DE ALERTAS UNIVERSITARIAS (PATRON BRIDGE)         ");
        System.out.println("==================================================================\n");

        // 1. Instanciamos los canales de envio (Implementors)
        NotificationChannel email = new EmailChannel("estudiante@universidad.edu.co");
        NotificationChannel sms = new SMSChannel("+57 300 123 4567");
        NotificationChannel whatsApp = new WhatsAppChannel("+57 311 987 6543");

        // 2. Alertas Academicas enviadas por diferentes canales
        System.out.println("------------------------------------------------------------------");
        System.out.println(" CASO 1: ALERTAS ACADEMICAS ENVIADAS POR CORREO Y SMS");
        System.out.println("------------------------------------------------------------------");
        Alert academicEmail = new AcademicAlert(email);
        academicEmail.send("Las notas del segundo corte ya estan disponibles en el portal.");
        System.out.println();

        Alert academicSMS = new AcademicAlert(sms);
        academicSMS.send("Recordatorio: El plazo de matricula financiera vence manana a las 11:59 PM.");
        System.out.println();

        // 3. Alertas Urgentes enviadas por diferentes canales
        System.out.println("------------------------------------------------------------------");
        System.out.println(" CASO 2: ALERTAS URGENTES ENVIADAS POR CORREO Y SMS");
        System.out.println("------------------------------------------------------------------");
        Alert urgentEmail = new UrgentAlert(email);
        urgentEmail.send("Simulacro de evacuacion general por sismo hoy a las 3:00 PM.");
        System.out.println();

        Alert urgentSMS = new UrgentAlert(sms);
        urgentSMS.send("Cierre temporal del bloque B por labores de mantenimiento electrico.");
        System.out.println();

        // 4. Reto 4: Integracion de WhatsApp sin crear clases por combinacion
        System.out.println("------------------------------------------------------------------");
        System.out.println(" CASO 3 (RETO 4): INCORPORACION DE WHATSAPP SIN CREAR CLASES COMBINADAS");
        System.out.println(" [Una sola clase WhatsAppChannel funciona con cualquier tipo de alerta]");
        System.out.println("------------------------------------------------------------------");
        Alert academicWhatsApp = new AcademicAlert(whatsApp);
        academicWhatsApp.send("Su solicitud de homologacion de materias ha sido aprobada.");
        System.out.println();

        Alert urgentWhatsApp = new UrgentAlert(whatsApp);
        urgentWhatsApp.send("Suspension de clases presenciales en jornada nocturna por tormenta.");
        System.out.println();

        // 5. Demostracion de flexibilidad dinamica del patron Bridge
        System.out.println("------------------------------------------------------------------");
        System.out.println(" CASO 4: CAMBIO DINAMICO DE CANAL EN TIEMPO DE EJECUCION (BRIDGE)");
        System.out.println("------------------------------------------------------------------");
        Alert alertaDinamica = new UrgentAlert(email);
        System.out.println(">> Enviando alerta urgente inicialmente por Correo:");
        alertaDinamica.send("Fuga de gas reportada en laboratorios de quimica.");
        System.out.println();

        System.out.println(">> Cambiando en caliente el canal de envio a WhatsApp (sin recrear la alerta)...");
        alertaDinamica.setChannel(whatsApp);
        alertaDinamica.send("Fuga de gas reportada en laboratorios de quimica (Reenvio prioritario).");

        System.out.println("\n==================================================================");
        System.out.println("       EJECUCION COMPLETADA CON EXITO                             ");
        System.out.println("==================================================================");
    }
}

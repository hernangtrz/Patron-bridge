package com.universidad.antes;

/**
 * Demostración del diseño ANTES de aplicar el patrón Bridge.
 * Muestra el acoplamiento rígido y la necesidad de una clase por cada combinación.
 */
public class MainAntes {
    public static void main(String[] args) {
        System.out.println("==================================================================");
        System.out.println("   DISENO ORIGINAL (SIN PATRON BRIDGE) - PROBLEMA DE COMBINACIONES");
        System.out.println("==================================================================\n");

        // 1. Cada combinación requiere una clase separada
        Alert academicEmail = new AcademicEmailAlert("estudiante@universidad.edu.co");
        academicEmail.send("Las notas finales han sido publicadas.");
        System.out.println();

        Alert academicSMS = new AcademicSMSAlert("+57 300 123 4567");
        academicSMS.send("Plazo de matricula vence manana.");
        System.out.println();

        Alert urgentEmail = new UrgentEmailAlert("estudiante@universidad.edu.co");
        urgentEmail.send("Evacuacion del campus por simulacro general.");
        System.out.println();

        Alert urgentSMS = new UrgentSMSAlert("+57 300 123 4567");
        urgentSMS.send("Cierre de acceso principal.");
        System.out.println();

        System.out.println("------------------------------------------------------------------");
        System.out.println(" LIMITACION IDENTIFICADA (RETO 1 Y RETO 4):");
        System.out.println(" Si la universidad ahora desea incorporar un nuevo canal como WHATSAPP,");
        System.out.println(" este diseno nos obliga a crear DOS NUEVAS CLASES:");
        System.out.println("   1. AcademicWhatsAppAlert");
        System.out.println("   2. UrgentWhatsAppAlert");
        System.out.println(" Y si manana se agrega un tipo de alerta 'FinancialAlert', habria que");
        System.out.println(" crear FinancialEmailAlert, FinancialSMSAlert y FinancialWhatsAppAlert.");
        System.out.println(" Formula del problema: Total Clases = Tipos x Canales (Crecimiento N x M)");
        System.out.println("------------------------------------------------------------------");
    }
}

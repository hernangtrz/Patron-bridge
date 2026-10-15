package despues;

import despues.formato.FormatoHTML;
import despues.formato.FormatoJSON;
import despues.formato.FormatoPDF;
import despues.formato.FormatoReporte;
import despues.reporte.Reporte;
import despues.reporte.ReporteFinanciero;
import despues.reporte.ReporteVentas;

public class MainDespues {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   CASO DESPUES: APLICANDO PATRON BRIDGE     ");
        System.out.println("==============================================\n");

        // 1. Creamos las implementaciones de formato de manera independiente
        FormatoReporte pdf = new FormatoPDF();
        FormatoReporte html = new FormatoHTML();
        FormatoReporte json = new FormatoJSON();

        // 2. Creamos reportes y les asociamos cualquier formato mediante el "puente"
        System.out.println("--- 1. Reporte de Ventas en formato PDF ---");
        Reporte reporteVentas = new ReporteVentas(120500.0, 450, pdf);
        reporteVentas.generar();
        System.out.println();

        System.out.println("--- 2. Mismo Reporte de Ventas cambiado dinamicamente a HTML (en Runtime) ---");
        reporteVentas.setFormato(html);
        reporteVentas.generar();
        System.out.println();

        System.out.println("--- 3. Mismo Reporte de Ventas cambiado a JSON ---");
        reporteVentas.setFormato(json);
        reporteVentas.generar();
        System.out.println();

        System.out.println("--- 4. Reporte Financiero con formato HTML ---");
        Reporte reporteFinanzas = new ReporteFinanciero(500000.0, 320000.0, html);
        reporteFinanzas.generar();
        System.out.println();

        System.out.println("--- 5. Reporte Financiero con formato PDF ---");
        reporteFinanzas.setFormato(pdf);
        reporteFinanzas.generar();
        System.out.println();

        System.out.println("==============================================");
        System.out.println("VENTAJAS CLAVE DEMOSTRADAS:");
        System.out.println("1. Desacoplamiento: La logica del reporte no sabe como se renderiza el formato.");
        System.out.println("2. Extensibilidad lineal (M + N): 2 reportes + 3 formatos = 5 clases.");
        System.out.println("   (En el caso 'Antes' habriamos necesitado 2 x 3 = 6 clases).");
        System.out.println("3. Dinamico: Podemos cambiar el formato en tiempo de ejecucion con setFormato().");
        System.out.println("==============================================");
    }
}

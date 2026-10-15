package antes;

public class MainAntes {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   CASO ANTES DE BRIDGE: HERENCIA DIRECTA    ");
        System.out.println("==============================================\n");

        Reporte rep1 = new ReporteVentasPDF("Total vendido: $120,500 USD en Q3");
        rep1.imprimir();

        System.out.println();

        Reporte rep2 = new ReporteVentasHTML("Total vendido: $120,500 USD en Q3");
        rep2.imprimir();

        System.out.println();

        Reporte rep3 = new ReporteFinancieroPDF("Ingresos: $500k | Gastos: $320k | Utilidad: $180k");
        rep3.imprimir();

        System.out.println();

        Reporte rep4 = new ReporteFinancieroHTML("Ingresos: $500k | Gastos: $320k | Utilidad: $180k");
        rep4.imprimir();

        System.out.println("\n----------------------------------------------");
        System.out.println("PROBLEMA:");
        System.out.println("2 tipos de reporte x 2 formatos = 4 clases.");
        System.out.println("Si agregamos formato JSON y reporte Inventario:");
        System.out.println("3 tipos x 3 formatos = 9 clases! (Explosion de clases)");
        System.out.println("----------------------------------------------");
    }
}

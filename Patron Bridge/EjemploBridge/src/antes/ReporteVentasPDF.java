package antes;

public class ReporteVentasPDF extends Reporte {
    public ReporteVentasPDF(String datos) {
        super("Reporte de Ventas", datos);
    }

    @Override
    public void imprimir() {
        System.out.println("=== Generando [PDF] ===");
        System.out.println("[PDF] Titulo: " + titulo);
        System.out.println("[Ventas] Datos: " + datos);
        System.out.println("=======================");
    }
}

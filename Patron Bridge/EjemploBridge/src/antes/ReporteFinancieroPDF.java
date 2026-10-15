package antes;

public class ReporteFinancieroPDF extends Reporte {
    public ReporteFinancieroPDF(String datos) {
        super("Reporte Financiero Anual", datos);
    }

    @Override
    public void imprimir() {
        System.out.println("=== Generando [PDF] ===");
        System.out.println("[PDF] Titulo: " + titulo);
        System.out.println("[Finanzas] Balance: " + datos);
        System.out.println("=======================");
    }
}

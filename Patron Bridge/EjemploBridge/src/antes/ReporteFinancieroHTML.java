package antes;

public class ReporteFinancieroHTML extends Reporte {
    public ReporteFinancieroHTML(String datos) {
        super("Reporte Financiero Anual", datos);
    }

    @Override
    public void imprimir() {
        System.out.println("<html>");
        System.out.println("  <head><title>" + titulo + "</title></head>");
        System.out.println("  <body><p>Finanzas: " + datos + "</p></body>");
        System.out.println("</html>");
    }
}

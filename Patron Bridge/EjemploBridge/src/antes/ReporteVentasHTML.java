package antes;

public class ReporteVentasHTML extends Reporte {
    public ReporteVentasHTML(String datos) {
        super("Reporte de Ventas", datos);
    }

    @Override
    public void imprimir() {
        System.out.println("<html>");
        System.out.println("  <head><title>" + titulo + "</title></head>");
        System.out.println("  <body><p>Ventas: " + datos + "</p></body>");
        System.out.println("</html>");
    }
}

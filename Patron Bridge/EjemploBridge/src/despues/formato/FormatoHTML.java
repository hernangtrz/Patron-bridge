package despues.formato;

/**
 * IMPLEMENTACIÓN CONCRETA 2: Formato HTML
 */
public class FormatoHTML implements FormatoReporte {
    @Override
    public void renderizarCabecera(String titulo) {
        System.out.println("<!DOCTYPE html>");
        System.out.println("<html>");
        System.out.println("<head><title>" + titulo + "</title></head>");
        System.out.println("<body>");
        System.out.println("  <header><h1>" + titulo + "</h1></header>");
    }

    @Override
    public void renderizarCuerpo(String contenido) {
        System.out.println("  <main>");
        System.out.println("    <p class=\"report-body\">" + contenido + "</p>");
        System.out.println("  </main>");
    }

    @Override
    public void renderizarPie() {
        System.out.println("  <footer><small>(c) 2026 Sistema de Reportes</small></footer>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}

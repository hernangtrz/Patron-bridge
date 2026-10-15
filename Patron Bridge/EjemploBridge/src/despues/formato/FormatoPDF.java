package despues.formato;

/**
 * IMPLEMENTACIÓN CONCRETA 1: Formato PDF
 */
public class FormatoPDF implements FormatoReporte {
    @Override
    public void renderizarCabecera(String titulo) {
        System.out.println("=== [EXPORTANDO A PDF] ===");
        System.out.println(">> ENCABEZADO PDF: " + titulo.toUpperCase());
        System.out.println("----------------------------------------------");
    }

    @Override
    public void renderizarCuerpo(String contenido) {
        System.out.println(">> CUERPO PDF:");
        System.out.println("   " + contenido);
    }

    @Override
    public void renderizarPie() {
        System.out.println("----------------------------------------------");
        System.out.println(">> PIE: [Pagina 1 de 1 - Motor iText/PDFRenderer]");
        System.out.println("==============================================");
    }
}

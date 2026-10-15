package despues.formato;

/**
 * IMPLEMENTACIÓN CONCRETA 3: Formato JSON
 * ¡Observa que añadir un nuevo formato solo requiere esta clase!
 * No tenemos que modificar ninguna clase de Reporte existente.
 */
public class FormatoJSON implements FormatoReporte {
    @Override
    public void renderizarCabecera(String titulo) {
        System.out.println("{");
        System.out.println("  \"tipo\": \"reporte\",");
        System.out.println("  \"titulo\": \"" + titulo + "\",");
    }

    @Override
    public void renderizarCuerpo(String contenido) {
        // Escapamos comillas dobles si las hubiera
        String jsonSafe = contenido.replace("\"", "\\\"");
        System.out.println("  \"data\": \"" + jsonSafe + "\"");
    }

    @Override
    public void renderizarPie() {
        System.out.println("}");
    }
}

package despues.formato;

/**
 * IMPLEMENTADOR (Implementor en el patrón Bridge):
 * Define la interfaz para las operaciones de implementación (formato/renderizado).
 * No necesita coincidir directamente con la interfaz de alto nivel de Reporte.
 */
public interface FormatoReporte {
    void renderizarCabecera(String titulo);
    void renderizarCuerpo(String contenido);
    void renderizarPie();
}

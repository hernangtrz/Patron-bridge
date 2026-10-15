package despues.reporte;

import despues.formato.FormatoReporte;

/**
 * ABSTRACCIÓN (Abstraction en el patrón Bridge):
 * Define la lógica de alto nivel y mantiene una referencia al Implementador (el Puente/Bridge).
 */
public abstract class Reporte {
    // EL PUENTE (BRIDGE): Composición en lugar de herencia
    protected FormatoReporte formato;
    protected String titulo;

    public Reporte(String titulo, FormatoReporte formato) {
        this.titulo = titulo;
        this.formato = formato;
    }

    // Permite cambiar la implementación (formato) dinámicamente en tiempo de ejecución
    public void setFormato(FormatoReporte formato) {
        this.formato = formato;
    }

    public FormatoReporte getFormato() {
        return formato;
    }

    // Método que delega las operaciones de renderizado al Implementador
    public abstract void generar();
}

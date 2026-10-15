package antes;

/**
 * Clase base del reporte sin aplicar el patrón Bridge.
 */
public abstract class Reporte {
    protected String titulo;
    protected String datos;

    public Reporte(String titulo, String datos) {
        this.titulo = titulo;
        this.datos = datos;
    }

    public abstract void imprimir();
}

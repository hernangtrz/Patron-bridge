package despues.reporte;

import despues.formato.FormatoReporte;

/**
 * ABSTRACCIÓN REFINADA 1 (Refined Abstraction):
 * Especialización de la abstracción para el dominio de ventas.
 */
public class ReporteVentas extends Reporte {
    private double totalVentas;
    private int transacciones;

    public ReporteVentas(double totalVentas, int transacciones, FormatoReporte formato) {
        super("Reporte de Ventas", formato);
        this.totalVentas = totalVentas;
        this.transacciones = transacciones;
    }

    @Override
    public void generar() {
        // Prepara los datos de negocio
        String datos = String.format("Ventas Totales: $%,.2f USD | Numero de Transacciones: %d",
                                      totalVentas, transacciones);

        // Delega la presentación al objeto implementador (puente)
        formato.renderizarCabecera(titulo);
        formato.renderizarCuerpo(datos);
        formato.renderizarPie();
    }
}

package despues.reporte;

import despues.formato.FormatoReporte;

/**
 * ABSTRACCIÓN REFINADA 2 (Refined Abstraction):
 * Especialización de la abstracción para el dominio financiero.
 */
public class ReporteFinanciero extends Reporte {
    private double ingresos;
    private double egresos;

    public ReporteFinanciero(double ingresos, double egresos, FormatoReporte formato) {
        super("Balance Financiero Anual", formato);
        this.ingresos = ingresos;
        this.egresos = egresos;
    }

    @Override
    public void generar() {
        double utilidad = ingresos - egresos;
        String datos = String.format("Ingresos: $%,.2f | Gastos: $%,.2f | Utilidad Neta: $%,.2f",
                                      ingresos, egresos, utilidad);

        // Delega la presentación al objeto implementador (puente)
        formato.renderizarCabecera(titulo);
        formato.renderizarCuerpo(datos);
        formato.renderizarPie();
    }
}

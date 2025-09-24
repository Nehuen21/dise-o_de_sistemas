package ejercicio3;

import java.util.ArrayList;
import java.util.List;

// Representa la recaudación total de una ciudad a partir de varios impuestos
public class Recaudacion {
    private List<Impuesto> impuestos;

    public Recaudacion() {
        this.impuestos = new ArrayList<>();
    }

    // Agregar un impuesto (ej: imp1, imp2, etc.)
    public void agregarImpuesto(Impuesto impuesto) {
        impuestos.add(impuesto);
    }

    // Calcular el total recaudado (suma de todos los impuestos)
    public double calcularTotal() {
        double total = 0;
        for (Impuesto imp : impuestos) {
            total += imp.getMonto();
        }
        return total;
    }
}


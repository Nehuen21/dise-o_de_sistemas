package ejercicio3;

// Representa un tipo de impuesto (imp1, imp2, etc.)
public class Impuesto {
    private String nombre;
    private double monto;

    public Impuesto(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMonto() {
        return monto;
    }
}


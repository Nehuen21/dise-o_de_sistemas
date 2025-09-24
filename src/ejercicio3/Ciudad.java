package ejercicio3;

// Representa una ciudad con habitantes, recaudación e información de gastos
public class Ciudad {
    private String nombre;
    private int habitantes;
    private Recaudacion recaudacion;
    private Gasto gasto;

    public Ciudad(String nombre, int habitantes, Recaudacion recaudacion, Gasto gasto) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.recaudacion = recaudacion;
        this.gasto = gasto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public boolean estaEnDeficit() {
        // Solo se controla si tiene más de 100.000 habitantes
        if (habitantes > 100000) {
            return gasto.getMonto() > recaudacion.calcularTotal();
        }
        return false; // si no llega a 100.000 hab, no se analiza
    }
}


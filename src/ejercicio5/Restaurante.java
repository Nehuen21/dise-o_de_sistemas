package ejercicio5;

import java.util.ArrayList;
import java.util.List;

// Representa un restaurante (ej: "La Trattoria")
public class Restaurante {
    private String nombre;
    private List<Plato> platos; // lista de platos ofrecidos

    // Constructor: inicializa el nombre y la lista vacía
    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.platos = new ArrayList<>();
    }

    // Método para agregar un plato, validando que no supere los 20
    public boolean agregarPlato(Plato plato) {
        if (platos.size() < 20) { // validación de la restricción del enunciado
            platos.add(plato);
            return true;
        }
        return false; // devuelve false si ya hay 20 platos
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Getter de la lista de platos
    public List<Plato> getPlatos() {
        return platos;
    }
}

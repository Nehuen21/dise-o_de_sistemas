package ejercicio3;

import java.util.ArrayList;
import java.util.List;

// Representa una provincia que tiene varias ciudades
public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public void agregarCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public String getNombre() {
        return nombre;
    }

    // Verifica si más de la mitad de las ciudades están en déficit
    public boolean masDeLaMitadEnDeficit() {
        int deficit = 0;
        for (Ciudad c : ciudades) {
            if (c.estaEnDeficit()) {
                deficit++;
            }
        }
        return deficit > ciudades.size() / 2;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }
}


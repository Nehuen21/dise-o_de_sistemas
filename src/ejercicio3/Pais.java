package ejercicio3;

import java.util.ArrayList;
import java.util.List;

// Representa un país que tiene provincias
public class Pais {
    private String nombre;
    private List<Provincia> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    // Método para listar las ciudades en déficit
    public void mostrarCiudadesEnDeficit() {
        System.out.println("Ciudades en déficit del país " + nombre + ":");
        for (Provincia p : provincias) {
            for (Ciudad c : p.getCiudades()) {
                if (c.estaEnDeficit()) {
                    System.out.println(" - " + c.getNombre() + " (Provincia: " + p.getNombre() + ")");
                }
            }
        }
    }

    // Método para mostrar provincias con más de la mitad de ciudades en déficit
    public void mostrarProvinciasConDeficit() {
        System.out.println("Provincias con más de la mitad de ciudades en déficit:");
        for (Provincia p : provincias) {
            if (p.masDeLaMitadEnDeficit()) {
                System.out.println(" - " + p.getNombre());
            }
        }
    }
}


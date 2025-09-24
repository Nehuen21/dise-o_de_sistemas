package ejercicio5;

import java.util.ArrayList;
import java.util.List;

// Representa una ciudad que contiene personas y restaurantes
public class Ciudad {
    private String nombre;
    private List<Persona> personas;
    private List<Restaurante> restaurantes;

    // Constructor
    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.personas = new ArrayList<>();
        this.restaurantes = new ArrayList<>();
    }

    // Agregar una persona a la ciudad
    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    // Agregar un restaurante a la ciudad
    public void agregarRestaurante(Restaurante restaurante) {
        restaurantes.add(restaurante);
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Getter de las personas
    public List<Persona> getPersonas() {
        return personas;
    }

    // Getter de los restaurantes
    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }
}


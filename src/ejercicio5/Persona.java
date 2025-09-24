package ejercicio5;

import java.util.ArrayList;
import java.util.List;

// Representa a una persona que vive en una ciudad
public class Persona {
    private String nombre;
    private Ciudad ciudad; // relación: una persona pertenece a una ciudad
    private List<Restaurante> restaurantesFrecuentados;

    // Constructor
    public Persona(String nombre, Ciudad ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.restaurantesFrecuentados = new ArrayList<>();
        ciudad.agregarPersona(this); // automáticamente se registra en la ciudad
    }

    // Método para agregar un restaurante a la lista de frecuentados
    public void agregarRestauranteFrecuentado(Restaurante restaurante) {
        restaurantesFrecuentados.add(restaurante);
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Getter de la ciudad
    public Ciudad getCiudad() {
        return ciudad;
    }

    // Getter de los restaurantes frecuentados
    public List<Restaurante> getRestaurantesFrecuentados() {
        return restaurantesFrecuentados;
    }
}


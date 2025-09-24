package ejercicio5;

// Una sucursal de un restaurante, con dirección
public class Sucursal {
    private String direccion;
    private Restaurante restaurante; // relación: una sucursal pertenece a un restaurante

    // Constructor
    public Sucursal(String direccion, Restaurante restaurante) {
        this.direccion = direccion;
        this.restaurante = restaurante;
    }

    // Getter de la dirección
    public String getDireccion() {
        return direccion;
    }

    // Getter del restaurante al que pertenece la sucursal
    public Restaurante getRestaurante() {
        return restaurante;
    }
}


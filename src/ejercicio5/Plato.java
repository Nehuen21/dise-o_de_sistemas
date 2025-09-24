package ejercicio5;

// Representa un plato de comida (ej: Pizza, Hamburguesa)
public class Plato {
    private String nombre; // atributo privado para cumplir con encapsulación

    // Constructor: sirve para crear un objeto Plato con un nombre
    public Plato(String nombre) {
        this.nombre = nombre;
    }

    // Getter: permite leer el nombre del plato
    public String getNombre() {
        return nombre;
    }

    // NOTA: No incluimos setNombre porque asumimos que el plato no cambia una vez creado.
}


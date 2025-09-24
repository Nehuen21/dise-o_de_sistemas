package ejercicio5;

public class Main {
    public static void main(String[] args) {
        // Creamos una ciudad
        Ciudad mendoza = new Ciudad("Mendoza");

        // Creamos un restaurante en esa ciudad
        Restaurante trattoria = new Restaurante("La Trattoria");
        mendoza.agregarRestaurante(trattoria);

        // Le agregamos un plato
        Plato pizza = new Plato("Pizza");
        trattoria.agregarPlato(pizza);

        // Creamos una persona que vive en Mendoza
        Persona juan = new Persona("Juan", mendoza);

        // Juan frecuenta "La Trattoria"
        juan.agregarRestauranteFrecuentado(trattoria);

        // Mostramos información
        System.out.println("Ciudad: " + mendoza.getNombre());
        System.out.println("Restaurante: " + trattoria.getNombre());
        System.out.println("Plato: " + pizza.getNombre());
        System.out.println("Persona: " + juan.getNombre() +
                " vive en " + juan.getCiudad().getNombre() +
                " y frecuenta " + juan.getRestaurantesFrecuentados().get(0).getNombre());
    }
}


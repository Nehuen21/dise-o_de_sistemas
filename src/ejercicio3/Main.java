package ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Creamos un país
        Pais argentina = new Pais("Argentina");

        // Creamos una provincia
        Provincia mendoza = new Provincia("Mendoza");
        argentina.agregarProvincia(mendoza);

        // Creamos recaudación para una ciudad
        Recaudacion rec1 = new Recaudacion();
        rec1.agregarImpuesto(new Impuesto("imp1", 50000));
        rec1.agregarImpuesto(new Impuesto("imp2", 30000));
        rec1.agregarImpuesto(new Impuesto("imp3", 20000));
        rec1.agregarImpuesto(new Impuesto("imp4", 10000));
        rec1.agregarImpuesto(new Impuesto("imp5", 15000));

        // Gasto de la ciudad
        Gasto gasto1 = new Gasto(150000);

        // Ciudad con más de 100.000 habitantes
        Ciudad ciudad1 = new Ciudad("Ciudad A", 120000, rec1, gasto1);
        mendoza.agregarCiudad(ciudad1);

        // Otra ciudad sin déficit
        Recaudacion rec2 = new Recaudacion();
        rec2.agregarImpuesto(new Impuesto("imp1", 80000));
        rec2.agregarImpuesto(new Impuesto("imp2", 70000));
        rec2.agregarImpuesto(new Impuesto("imp3", 60000));
        rec2.agregarImpuesto(new Impuesto("imp4", 50000));
        rec2.agregarImpuesto(new Impuesto("imp5", 40000));

        Gasto gasto2 = new Gasto(100000);
        Ciudad ciudad2 = new Ciudad("Ciudad B", 150000, rec2, gasto2);
        mendoza.agregarCiudad(ciudad2);

        // Mostramos resultados
        argentina.mostrarCiudadesEnDeficit();
        argentina.mostrarProvinciasConDeficit();
    }
}

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Especie {

    public enum TipoEspecie {
        VEGETAL,
        ANIMAL
    }

    public enum Alimentacion {
        HERBIVORA,
        CARNIVORA,
        OMNIVORA
    }

    private String nombreCientifico;
    private String nombreVulgar;
    private int numeroIndividuos;
    private Set<Especie> alimento;
    private TipoEspecie tipo;

    // Atributos específicos de vegetales (opcionales)
    private Boolean tieneFloracion;
    private String periodoFloracion;

    // Atributos específicos de animales (opcionales)
    private String periodoCelo;
    private Alimentacion alimentacion;
}
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Area {
    private String nombre;
    private double km2;
    private Set<Especie> especies; // Ahora solo hay una clase Especie
}
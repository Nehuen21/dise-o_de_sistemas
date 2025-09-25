import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.Map;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alojamiento {
    private String nombre;
    private int capacidad;
    private String categoria;
    private Map<Visitante, Map<Integer, List<LocalDate>>> visitantes;
    private List<Excursion> excursionesOrganizadas;
}
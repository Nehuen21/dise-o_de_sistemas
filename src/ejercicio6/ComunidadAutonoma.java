import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComunidadAutonoma {
    private String nombre;
    private List<ParqueNacional> parques;
    private String organismoResponsable;
}
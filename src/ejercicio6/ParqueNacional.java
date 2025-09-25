import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParqueNacional {
    private String nombre;
    private LocalDate fechaDeclaracion;
    private Set<Area> areas;
    private List<Alojamiento> alojamientos;
    private List<Entrada> entradas;
    private Set<Personal> personal; // Mantenemos la clase Personal
}
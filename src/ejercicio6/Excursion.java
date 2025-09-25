import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Excursion {
    private String codigo;
    private LocalDate dia;
    private LocalTime hora;
    private Set<Alojamiento> alojamientos;
    private Set<Visitante> visitantesInscritos;
}
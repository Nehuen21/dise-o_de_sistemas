import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProyectoInvestigacion {
    private String nombre;
    private double presupuesto;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}
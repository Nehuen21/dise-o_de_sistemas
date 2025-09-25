import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personal {
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private double sueldo;
    private String numeroSeguridadSocial;
    private ParqueNacional parqueTrabajo;

    private List<String> cargos; // "celador", "guarda", "investigador"

    // Atributos de Celador
    private Entrada entradaAsignada;
    private Map<Visitante, LocalDate> registroVisitas;

    // Atributos de Guarda
    private Area areaAsignada;
    private String tipoVehiculo;
    private String matriculaVehiculo;

    // Atributos de Investigador
    private String titulacion;
    private Map<ProyectoInvestigacion, List<Especie>> especiesInvestigadas;
}
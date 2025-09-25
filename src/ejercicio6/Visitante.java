import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitante {
    private String dni;
    private String nombre;
    private String direccion;
    private String profesion;
}
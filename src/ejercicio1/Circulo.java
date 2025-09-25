import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class Circulo {
private Elipse elipse;


public  Circulo(Elipse elipse){
this.elipse=elipse;}
}

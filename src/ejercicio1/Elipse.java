import lombok.Builder;
import lombok.Data;
@Data
@Builder

public class Elipse {
    protected String tipo_elipse;
    protected double largura;
    protected double altura;
    public  Elipse(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
}

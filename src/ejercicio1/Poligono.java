import lombok.Getter;\

import  java.util.List;

@Getter

public abstract class Poligono extends Figura {
    protected List<Lado> lados;

    public Poligono(String nombre, List<Lado> lados) {
        super(nombre);
        this.lados = lados;
    }


}

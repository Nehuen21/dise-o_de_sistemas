import lombok.Getter;

@Getter
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
    this.nombre = nombre;}

}

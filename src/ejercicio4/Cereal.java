import java.util.ArrayList;
import java.util.List;

public class Cereal {
    private List<String> granosCosechaGruesa; // girasol, maíz
    private List<String> granosCosechaFina;   // trigo, avena
    private List<String> pasturas;            // alfalfa, trébol subterráneo

    public Cereal() {
        this.granosCosechaGruesa = new ArrayList<>();
        this.granosCosechaFina = new ArrayList<>();
        this.pasturas = new ArrayList<>();
    }

    public void agregarGranoCosechaGruesa(String grano) {
        this.granosCosechaGruesa.add(grano);
    }

    public void agregarGranoCosechaFina(String grano) {
        this.granosCosechaFina.add(grano);
    }

    public void agregarPastura(String pastura) {
        this.pasturas.add(pastura);
    }

    public List<String> getGranosCosechaGruesa() {
        return granosCosechaGruesa;
    }

    public void setGranosCosechaGruesa(List<String> granosCosechaGruesa) {
        this.granosCosechaGruesa = granosCosechaGruesa;
    }

    public List<String> getGranosCosechaFina() {
        return granosCosechaFina;
    }

    public void setGranosCosechaFina(List<String> granosCosechaFina) {
        this.granosCosechaFina = granosCosechaFina;
    }

    public List<String> getPasturas() {
        return pasturas;
    }

    public void setPasturas(List<String> pasturas) {
        this.pasturas = pasturas;
    }
}
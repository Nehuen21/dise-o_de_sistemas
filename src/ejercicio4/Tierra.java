import java.util.ArrayList;
import java.util.List;

public class Tierra {
    private List<Pasturas> pasturas;
    private List<Agricultor> agricultores;

    public Tierra() {
        this.pasturas = new ArrayList<>();
        this.agricultores = new ArrayList<>();
    }

    public void agregarPastura(Pasturas pastura) {
        this.pasturas.add(pastura);
    }

    public void removerPastura(Pasturas pastura) {
        this.pasturas.remove(pastura);
    }

    public void agregarAgricultor(Agricultor agricultor) {
        this.agricultores.add(agricultor);
    }

    public void removerAgricultor(Agricultor agricultor) {
        this.agricultores.remove(agricultor);
    }

    public List<Pasturas> getPasturas() {
        return pasturas;
    }

    public void setPasturas(List<Pasturas> pasturas) {
        this.pasturas = pasturas;
    }

    public List<Agricultor> getAgricultores() {
        return agricultores;
    }

    public void setAgricultores(List<Agricultor> agricultores) {
        this.agricultores = agricultores;
    }
}
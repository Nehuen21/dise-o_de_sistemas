
import java.util.ArrayList;
import java.util.List;

public class LoteEspecial {
    private List<String> mineralesPrimarios;
    private List<Cereal> cereales;

    public LoteEspecial() {
        this.mineralesPrimarios = new ArrayList<>();
        this.cereales = new ArrayList<>();
    }

    public LoteEspecial(List<String> mineralesPrimarios) {
        this.mineralesPrimarios = mineralesPrimarios != null ? mineralesPrimarios : new ArrayList<>();
        this.cereales = new ArrayList<>();
    }

    public void agregarMineralPrimario(String mineral) {
        this.mineralesPrimarios.add(mineral);
    }

    public void removerMineralPrimario(String mineral) {
        this.mineralesPrimarios.remove(mineral);
    }

    public void agregarCereal(Cereal cereal) {
        this.cereales.add(cereal);
    }

    public void removerCereal(Cereal cereal) {
        this.cereales.remove(cereal);
    }

    public List<String> getMineralesPrimarios() {
        return mineralesPrimarios;
    }

    public void setMineralesPrimarios(List<String> mineralesPrimarios) {
        this.mineralesPrimarios = mineralesPrimarios;
    }

    public List<Cereal> getCereales() {
        return cereales;
    }

    public void setCereales(List<Cereal> cereales) {
        this.cereales = cereales;
    }
}
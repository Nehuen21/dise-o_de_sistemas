import java.util.ArrayList;
import java.util.List;

public class LoteNormal {
    private List<String> mineralesSecundarios;

    public LoteNormal() {
        this.mineralesSecundarios = new ArrayList<>();
    }

    public LoteNormal(List<String> mineralesSecundarios) {
        this.mineralesSecundarios = mineralesSecundarios != null ? mineralesSecundarios : new ArrayList<>();
    }

    public void agregarMineralSecundario(String mineral) {
        this.mineralesSecundarios.add(mineral);
    }

    public void removerMineralSecundario(String mineral) {
        this.mineralesSecundarios.remove(mineral);
    }

    public List<String> getMineralesSecundarios() {
        return mineralesSecundarios;
    }

    public void setMineralesSecundarios(List<String> mineralesSecundarios) {
        this.mineralesSecundarios = mineralesSecundarios;
    }
}
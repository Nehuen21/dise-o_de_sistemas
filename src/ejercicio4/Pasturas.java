import java.util.ArrayList;
import java.util.List;

public class Pasturas {
    private List<LoteEspecial> lotesEspeciales;
    private List<LoteNormal> lotesNormales;

    public Pasturas() {
        this.lotesEspeciales = new ArrayList<>();
        this.lotesNormales = new ArrayList<>();
    }

    public void agregarLoteEspecial(LoteEspecial loteEspecial) {
        this.lotesEspeciales.add(loteEspecial);
    }

    public void removerLoteEspecial(LoteEspecial loteEspecial) {
        this.lotesEspeciales.remove(loteEspecial);
    }

    public void agregarLoteNormal(LoteNormal loteNormal) {
        this.lotesNormales.add(loteNormal);
    }

    public void removerLoteNormal(LoteNormal loteNormal) {
        this.lotesNormales.remove(loteNormal);
    }

    public List<LoteEspecial> getLotesEspeciales() {
        return lotesEspeciales;
    }

    public void setLotesEspeciales(List<LoteEspecial> lotesEspeciales) {
        this.lotesEspeciales = lotesEspeciales;
    }

    public List<LoteNormal> getLotesNormales() {
        return lotesNormales;
    }

    public void setLotesNormales(List<LoteNormal> lotesNormales) {
        this.lotesNormales = lotesNormales;
    }
}
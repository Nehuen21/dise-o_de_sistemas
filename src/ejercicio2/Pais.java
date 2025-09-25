import java.util.ArrayList;

public class Pais {
    public ArrayList<Pais> limitaPais = new ArrayList<>();
    public ArrayList<Provincia> provincias = new ArrayList<>();
    public ArrayList<Provincia> limitaProvincias = new ArrayList<>();
    public Provincia esCapitalDePais;
    public Continente continente;
    public Pais(Provincia escapitalDePais,  Continente continente) {
        this.esCapitalDePais = escapitalDePais;
        this.continente = continente;
    }
public void addProvincia(Provincia prov){
        this.provincias.add(prov);
}
public void addLimitaProvincias(Provincia prov){
        this.limitaProvincias.add(prov);
}
}

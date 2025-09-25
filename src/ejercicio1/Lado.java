public class Lado {
    private Punto punto1;
    private Punto punto2;

    public Lado(Punto punto1, Punto punto2)
    {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public int getPunto1X() {
        return punto1.getX();
    }
    public int getPunto1Y() {
        return punto1.getY();
    }

    public int getPunto2X() {
        return punto2.getX();
    }
    public int getPunto2Y() {
        return punto2.getY();
    }
}

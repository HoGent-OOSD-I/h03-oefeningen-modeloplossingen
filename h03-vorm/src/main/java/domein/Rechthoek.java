package domein;

public class Rechthoek {

    public static final double STANDAARD_WAARDE = 1;

    private double lengte = STANDAARD_WAARDE;
    private double breedte = STANDAARD_WAARDE;

    public Rechthoek(double lengte, double breedte) {
        setLengte(lengte);
        setBreedte(breedte);
    }

    public Rechthoek() {
        this(10.0,7.0);
    }

    public double berekenOmtrek() {
        return 2 * (lengte + breedte);
    }

    public double berekenOppervlakte() {
        return lengte * breedte;
    }

    private void setLengte(double lengte) {
        if (lengte > 0)
            this.lengte = lengte;
    }

    private void setBreedte(double breedte) {
        if (breedte > 0)
            this.breedte = breedte;
    }

    public double getLengte() {
        return this.lengte;
    }

    public double getBreedte() {
        return this.breedte;
    }
}

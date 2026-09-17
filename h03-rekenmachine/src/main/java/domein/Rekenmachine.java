package domein;

public class Rekenmachine {

    private double resultaat;
    
    // zelf schrijven van een constructor is hier overbodig, 
    // want resultaat mag initieel zijn defaultwaarde (0) behouden
    // --> de (automatische) defaultconstructor volstaat

    public void telOp(double getal1, double getal2) {
        resultaat = getal1 + getal2;
    }

    public void trekAf(double getal1, double getal2) {
        resultaat = getal1 - getal2;
    }

    public void deel(double getal1, double getal2) {
        //if (getal2 == 0)
        // exception werpen (leerstof 2de semester)
        resultaat = getal1 / getal2;
    }

    public void vermenigvuldig(double getal1, double getal2) {
        resultaat = getal1 * getal2;
    }

    public double getResultaat() {
        return resultaat;
    }

}

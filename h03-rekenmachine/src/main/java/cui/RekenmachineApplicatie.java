package cui;

import domein.Rekenmachine;

public class RekenmachineApplicatie {

    void main() {
        start();
    }

    private void start() {

        Rekenmachine rekenmachine = new Rekenmachine();
        int keuze;
        char bewerking = '+';
        double getal1, getal2;

        keuze = maakMenuKeuze();
        while (keuze != 5) {
            getal1 = leesGetal("Geef het eerste getal: ");
            getal2 = leesGetal("Geef een tweede getal: ");

            switch (keuze) {
                case 1 -> {
                    rekenmachine.telOp(getal1, getal2);
                    toonResultaat(getal1, getal2, '+', rekenmachine.getResultaat());
                }
                case 2 -> {
                    rekenmachine.trekAf(getal1, getal2);
                    toonResultaat(getal1, getal2, '-', rekenmachine.getResultaat());
                }
                case 3 -> {
                    rekenmachine.vermenigvuldig(getal1, getal2);
                    toonResultaat(getal1, getal2, '*', rekenmachine.getResultaat());
                }
                case 4 -> {
                    rekenmachine.deel(getal1, getal2);
                    toonResultaat(getal1, getal2, '/', rekenmachine.getResultaat());
                }
            }

            keuze = maakMenuKeuze();
        }
    }

    private double leesGetal(String boodschap) {
        return Double.parseDouble(IO.readln(boodschap));
    }

    private void toonResultaat(double getal1, double getal2, char c, double resultaat) {
        IO.println(String.format("%.2f %c %.2f = %.2f%n", getal1, c, getal2, resultaat));
    }

    private int maakMenuKeuze() {
        int keuze;
        do {
            IO.println(
                    "Welke actie wil je uitvoeren?\n 1. Som \n 2. Verschil\n 3. Vermenigvuldiging\n 4. Deling\n 5. Stoppen");
            keuze = Integer.parseInt(IO.readln("Geef je keuze in: "));
        } while (keuze < 1 || keuze > 5);
        return keuze;
    }

}

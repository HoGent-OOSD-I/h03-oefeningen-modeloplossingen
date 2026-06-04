package cui;

import java.util.Scanner;

import domein.Rekenmachine;

public class RekenmachineApplicatie {

    public static void main(String[] args) {
        RekenmachineApplicatie ra = new RekenmachineApplicatie();
        ra.start();
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
        Scanner invoer = new Scanner(System.in);
        System.out.print(boodschap);
        return invoer.nextDouble();
    }

    private void toonResultaat(double getal1, double getal2, char c, double resultaat) {
        System.out.printf("%.2f %c %.2f = %.2f%n%n", getal1, c, getal2, resultaat);
    }

    private int maakMenuKeuze() {
        Scanner invoer = new Scanner(System.in);
        int keuze;
        do {
            System.out.println(
                    "Welke actie wil je uitvoeren?\n 1. Som \n 2. Verschil\n 3. Vermenigvuldiging\n 4. Deling\n 5. Stoppen");
            System.out.print("Geef je keuze in: ");
            keuze = invoer.nextInt();
        } while (keuze < 1 || keuze > 5);
        return keuze;
    }

}

package cui;

import java.util.Scanner;

import domein.Driehoek;
import domein.Rechthoek;

public class VormApplicatie {

    public static void main(String[] args) {

        VormApplicatie va = new VormApplicatie();
        va.start();
    }

    private Scanner invoer = new Scanner(System.in);

    private void start() {

        System.out.println("Rechthoeken en driehoeken");
        System.out.println("-------------------------");

        int aantalRechthoekenOppGroterDan50 = 0;
        int aantalRechthoekigeDriehoeken = 0;
        int totaalAantalVormen=0;

        int vorm = geefKeuzeVormIngeven();

        while (vorm != 0) {

            switch(vorm)
            {
                case 1 -> {//rechthoek

                    System.out.print("Geef de lengte van de rechthoek: ");
                    double lengte = invoer.nextDouble();
                    System.out.print("Geef de breedte van de rechthoek: ");
                    double breedte = invoer.nextDouble();

                    Rechthoek r = new Rechthoek(lengte,breedte);

                    if (r.berekenOppervlakte() > 50)
                        aantalRechthoekenOppGroterDan50++;
                }
                case 2 -> {//driehoek

                    System.out.print("Geef de lengte van zijde A: ");
                    int zijdeA = invoer.nextInt();
                    System.out.print("Geef de lengte van zijde B: ");
                    int zijdeB = invoer.nextInt();
                    System.out.print("Geef de lengte van zijde C: ");
                    int zijdeC = invoer.nextInt();

                    Driehoek d = new Driehoek(zijdeA,zijdeB,zijdeC);

                    if (d.isRechthoekig())
                        aantalRechthoekigeDriehoeken++;
                }
            }
            totaalAantalVormen++;

            vorm = geefKeuzeVormIngeven();

        }

        System.out.println("Overzicht vormen:");
        System.out.printf("Totaal aantal vormen: %d%n", totaalAantalVormen);
        System.out.printf("Aantal rechthoeken met opp > 50: %d%n", aantalRechthoekenOppGroterDan50);
        System.out.printf("Aantal rechthoekige driehoeken: %d%n", aantalRechthoekigeDriehoeken);

    }

    private int geefKeuzeVormIngeven() {
        int vorm;
        do {
            System.out.print("Wil je graag nog een vorm ingeven (1=een rechthoek, 2=een driehoek, 0=nee)? ");
            vorm = invoer.nextInt();
        }while(vorm<0 || vorm>2);
        return vorm;
    }
}

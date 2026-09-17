package cui;

import domein.Driehoek;
import domein.Rechthoek;

public class VormApplicatie {

    void main() {
        start();
    }

    private void start() {

        IO.println("Rechthoeken en driehoeken");
        IO.println("-------------------------");

        int aantalRechthoekenOppGroterDan50 = 0;
        int aantalRechthoekigeDriehoeken = 0;
        int totaalAantalVormen=0;

        int vorm = vraagGebruikerKeuze();

        while (vorm != 0) {

            switch(vorm)
            {
                case 1 -> {//rechthoek

                    double lengte = Double.parseDouble(IO.readln("Geef de lengte van de rechthoek: "));
                    double breedte = Double.parseDouble(IO.readln("Geef de breedte van de rechthoek: "));

                    Rechthoek r = new Rechthoek(lengte,breedte);

                    if (r.berekenOppervlakte() > 50)
                        aantalRechthoekenOppGroterDan50++;
                }
                case 2 -> {//driehoek

                    int zijdeA = Integer.parseInt(IO.readln("Geef de lengte van zijde A: "));
                    int zijdeB = Integer.parseInt(IO.readln("Geef de lengte van zijde B: "));
                    int zijdeC = Integer.parseInt(IO.readln("Geef de lengte van zijde C: "));

                    Driehoek d = new Driehoek(zijdeA,zijdeB,zijdeC);

                    if (d.isRechthoekig())
                        aantalRechthoekigeDriehoeken++;
                }
            }
            totaalAantalVormen++;

            vorm = vraagGebruikerKeuze();

        }

        IO.println("Overzicht vormen:");
        IO.println(String.format("Totaal aantal vormen: %d", totaalAantalVormen));
        IO.println(String.format("Aantal rechthoeken met opp > 50: %d", aantalRechthoekenOppGroterDan50));
        IO.println(String.format("Aantal rechthoekige driehoeken: %d", aantalRechthoekigeDriehoeken));

    }

    private int vraagGebruikerKeuze() {
        int vorm = Integer.parseInt(IO.readln("Wil je graag nog een vorm ingeven (1=een rechthoek, 2=een driehoek, 0=nee)? "));
        return vorm;
    }
}

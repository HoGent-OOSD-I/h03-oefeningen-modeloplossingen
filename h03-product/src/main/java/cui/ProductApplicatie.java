package cui;

import domein.Product;

public class ProductApplicatie {
    void main() {
        start();
    }

    private void start() {
        Product p1, p2, p3;
        int aantal1, aantal2, aantal3;

        p1 = new Product("pannenkoek", 0.125, 21, 5);
        p2 = new Product("pannenkoek met suiker", 2, 6, 10);
        p3 = new Product("pannenkoek met choco", 2.20, 6, 15);

        aantal1 = geefAantalStuks(p1.getNaam());
        aantal2 = geefAantalStuks(p2.getNaam());
        aantal3 = geefAantalStuks(p3.getNaam());

        double prijsP1 = p1.berekenPrijs(aantal1);
        double prijsP2 = p2.berekenPrijs(aantal2);
        double prijsP3 = p3.berekenPrijs(aantal3);

        double totalePrijs = prijsP1 + prijsP2 + prijsP3;

        IO.println(String.format("%nAan de kassa zal u %.2f EURO moeten betalen.", totalePrijs));
    }

    private int geefAantalStuks(String naam)
    {
        String boodschap = String.format("%nHoeveel stuks wilt u van '%s'? ", naam);
        int aantal = Integer.parseInt(IO.readln(boodschap));
        return aantal;
    }
}

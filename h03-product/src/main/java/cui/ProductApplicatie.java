package cui;

import domein.Product;
import java.util.Scanner;

public class ProductApplicatie {
    public static void main(String[] args) {
        ProductApplicatie pa = new ProductApplicatie();
        pa.start();
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

        System.out.printf("%nAan de kassa zal u %.2f EURO moeten betalen.%n", totalePrijs);
    }

    private int geefAantalStuks(String naam)
    {
        Scanner invoer = new Scanner(System.in);
        int aantal;
        do
        {
            System.out.printf("%nHoeveel stuk wilt u van '%s'? ", naam);
            aantal = invoer.nextInt();
        }while (aantal < 0);
        return aantal;
    }
}

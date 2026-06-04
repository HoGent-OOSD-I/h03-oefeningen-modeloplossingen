package domein;

public class Product {

    public final static int ONDERGRENS_BTW = 6, BOVENGRENS_BTW = 21,
            BOVENGRENS_KORTING_STUKS = 50, MINIMUM_AANTAL_STUKS = 6, STANDAARDWAARDE_PRIJS = 1;
    public final static String NAAM_ONBEKEND = "naam onbekend";

    private String naam = NAAM_ONBEKEND;
    private double prijsExclBtw = STANDAARDWAARDE_PRIJS;
    private int btwPercentage = BOVENGRENS_BTW;
    private int kortingStuksPercentage;

    public Product(String naam, double prijsExclBtw, int btwPercentage, int kortingStuksPercentage) {
        setNaam(naam);
        setPrijsExclBtw(prijsExclBtw);
        setBtwPercentage(btwPercentage);
        setKortingStuksPercentage(kortingStuksPercentage);
    }


    public final void setPrijsExclBtw(double prijsExclBtw) {
        if (prijsExclBtw > 0)
            this.prijsExclBtw = prijsExclBtw;
    }


    private void setNaam(String naam) {
        if (naam != null && !naam.isBlank())
            this.naam = naam;
    }


    private void setBtwPercentage(int btwPercentage) {
        if (btwPercentage >= ONDERGRENS_BTW && btwPercentage <= BOVENGRENS_BTW)
            this.btwPercentage = btwPercentage;
    }

    private void setKortingStuksPercentage(int kortingStuksPercentage) {
        if (kortingStuksPercentage >= 0 && kortingStuksPercentage <= BOVENGRENS_KORTING_STUKS)
            this.kortingStuksPercentage = kortingStuksPercentage;
    }


    public double getPrijsExclBtw() {
        return this.prijsExclBtw;
    }


    public int getBtwPercentage() {
        return this.btwPercentage;
    }

    public String getNaam() {
        return this.naam;
    }

    public int getKortingStuksPercentage() {
        return this.kortingStuksPercentage;
    }



    public double berekenPrijs(int aantal) {
        //if (aantal < 0)
        //exception werpen (leerstof 2de semester)

        double teBetalen;
        teBetalen = prijsExclBtw * (1 + (double) btwPercentage / 100) * aantal;

        if (aantal >= MINIMUM_AANTAL_STUKS)
            teBetalen -= teBetalen * kortingStuksPercentage / 100;
        return teBetalen;
    }

}

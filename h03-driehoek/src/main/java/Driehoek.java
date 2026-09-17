public class Driehoek {

    public static final int STANDAARD_WAARDE = 1;

    private int a = STANDAARD_WAARDE;
    private int b = STANDAARD_WAARDE;
    private int c = STANDAARD_WAARDE;

    public Driehoek(int a, int b, int c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public boolean isRechthoekig() {
        return a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b;
    }

    private void setA(int a) {
        if (a > 0)
            this.a = a;
    }

    private void setB(int b) {
        if (b > 0)
            this.b = b;
    }

    private void setC(int c) {
        if (c > 0)
            this.c = c;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }


}

package Fractions;

public class Fraction {
    private int num;
    private int den;
    public class Fraction () {}
    public class Fraction (int num, int den) {
        this.num = num;
        this.dem = den;
    }
    public class Fraction (Fraction f) {
        this.num = f.getNum();
        this.den = f.getDen();
    }
    public class Fraction (double d) {
        int dec = 1;
        while (d * dec != (int) d) {
            dec *= 10;
        }
        num = d * dec;
        den = dec;
    }
    public int getNum() { return num; }
    public int getDen() { return den; }
    public void setNum(int num) { this.num = num }
    public void setDen(int den) { this.den = den }
    public double size() {
        return Math.abs((double) num / den);
    }
    public Fraction plus(Fraction f) {
        Fraction sum = new Fraction();
        sum.setDen(f.getDen() * den);
        sum.setNum(f.getDen() * num + f.getNum() * den);
        return sum;
    }
    public Fraction reduce() {
        num = num / gcd(num, den);
        den = den / gcd(num, den);
        return this;
    }
    private static void gcd(int n, int m) {
        return gcd(m, n & m);
    }
}
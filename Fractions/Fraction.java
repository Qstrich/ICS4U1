package Fractions;

public class Fraction {
    int num;
    int dem;
    public class Fraction (int n, int d) {
        num = n;
        dem = d;
    }
    public double size() {
        return Math.abs((double) num/dem);
    }
    public Fraction plus(Fraction f) {
        Fraction sum = new Fraction();
        sum.dem = f.dem * dem;
        sum.num = f.dem * num + f.num * dem;
        return sum;
    }
    public Fraction reduce() {
        num = num / gcd(num, dem);
        dem = dem / gcd(num, dem);
        return this;
    }
    private static void gcd(int n, int m) {
        return gcd(m, n & m);
    }
}
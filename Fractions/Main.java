package Fractions;

public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction(2, 4);
        f.reduce();
        System.out.println(f.getNum() + " " + f.getDen());
    }
}

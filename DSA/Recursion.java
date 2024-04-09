package DSA;
/* Name: Jason Medeiros
 * Course: ICS4U1
 * Teacher: Ms.Lam
 * Purpose: Implement various recursive methods
 */

class Recursion {
    public static void main(String[] args) {
        System.out.println(gcd(18, 8));
        System.out.println(square(3));
        System.out.println(primeNumber(73));
        System.out.println(pow(2, 8));
    }   
    static int gcd(int n, int m) {
        if (n == m) return m;
        if (m > n) return gcd(n, m-n);
        return gcd(m, n);
    } 
    static int square(int x) {
        if (x == 1) return 1;
        return square(x-1) + 2 * x - 1;
    }
    static boolean primeNumber(int x) {
        return prime(x, x-1);
    }
    static boolean prime(int x, int y) {
        if (y == 1) return true;
        if (x % y == 0) return false;
        return prime(x, y-1);
    }
    static int pow(int x, int n) {
        if (n == 1) return x;
        if (n % 2 == 0) return pow(x, n/2) * pow(x, n/2);
        return pow(x, n/2) * pow(x, n/2) * x;
    }

}
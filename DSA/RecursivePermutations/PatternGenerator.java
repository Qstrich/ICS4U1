package RecursivePermutations;
import java.util.Scanner;
public class PatternGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("The bit patterns are: ");
            f("", sc.nextInt(), sc.nextInt());
            System.out.println();
        }

    }
    static void f(String s, int n, int k) {
        if (k == 0 && n == 0) {
            System.out. println(s);
            return;
        } 
        if (n == 0) return;
        if (k > 0) f(s + "1", n-1, k-1);
        f(s + "0", n-1, k);
    }
}
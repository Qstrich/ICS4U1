package RecursivePermutations;

import java.util.Scanner;

public class Golf {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int N = sc.nextInt(), C = sc.nextInt();
        int[] clubs = new int[C];
        for (int i = 0; i < C; i++) {
            clubs[i] = sc.nextInt();
        }
        System.out.println("The least number of shots is: " f(clubs, N));
    }
    static int f(int[] clubs, int n) {
        for (int i = 0; i < N) f(clubs, n);
    }
}

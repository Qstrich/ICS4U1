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
        System.out.println("The least number of shots is: " + f(clubs, N));
        sc.close();
    }
    static int f(int[] clubs, int N) {
        if (N == 0) return 0;
        int min = Integer.MAX_VALUE;
        for (int c: clubs) {
            if (N - c >= 0) min = Math.min(min, f(clubs, N - c) + 1);
        }
        return min;
    }
}

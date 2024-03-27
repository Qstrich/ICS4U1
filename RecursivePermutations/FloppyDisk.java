package RecursivePermutations;
import java.util.Scanner;

public class FloppyDisk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int x = 0; x < 5; x++) {
            int N = sc.nextInt();
            int[] disk = new int[N];
            for (int i = 0; i < N; i++) {
                disk[i] = sc.nextInt();
            }
            //1440 
        }
    }
    static int f(int[] disk, int size) {
        if (size <= 0) return 0;
        int max = 0;
        for (int d: disk) {
            max = Math.max(max, f(disk, size - d)) + 1;
        }
        return max;
    }
}

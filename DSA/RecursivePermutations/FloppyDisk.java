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
            System.out.println(f(disk, 1440, 0));
        }
    }
    static int f(int[] disk, int size, int idx) {
        if (size < 0) return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = idx; i < disk.length; i++) {
            min = Math.min(min, f(disk, size - disk[i], i+1));
        }
        return Math.min(min, size);
    }
}

/* Name: Jason Medeiros
 * Course: ICS4U1
 * Teacher: Ms.Lam
 * Purpose: More recursion programs
 */
public class MoreRecursion {
    public static void main(String[] args) {
        countHanoi(3);
    }
    static int countHanoi(int n) {
        if (n == 1) return 1;
        return 2 * countHanoi(n-1) + 1;
    }
    static void printRow(int n) {
        if (n < 1) {
            System.out.println();
            return;
        }
        System.out.print("*");
        printRow(n-1);
    }
    static void printTriangle(int n) {
        if (n < 1) return;
        printRow(n);
        printTriangle(n-1);
    }
    static int largest(int[] list) {
        return largest(list, 0, list.length-1);
    }
    static int largest(int[] list, int start, int end) {
        if (start == end) return list[start];
        return Math.max(largest(list, start+1, end), list[start]);
    }
    static int binarySearch(int[] list, int x) {
        return binarySearch(list, x, 0, a.length-1);
    }
    static int binarySearch(int[] list, int x, int lo, int hi) {
        int mid = (hi + lo) /2;
        if (list[mid] == x) return mid;
        if (list[mid] > x) return binarySearch(list, x, lo, mid -1);
        return binarySearch(list, x, mid + 1, hi);
    }  


}

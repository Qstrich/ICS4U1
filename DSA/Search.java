package DSA;
/* 
Name: Jason Medeiros
Course: ICS4U1
Teacher: Ms. Lam
Description: Search an array for a value using sequential and binary search
 */
public class Search {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 13, 15, 18};
        System.out.println(binarySearch(a, 5));
    }
    static int binarySearch(int[] a, int x) {
        int hi = a.length-1, lo = 0;
        while (lo < hi) {
            int mid = (hi + lo) /2;
            if (x == a[mid]) {
                return mid;
            } else if (x < a[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }
    static int sequentialSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) 
            if (a[i] == x) return i;
        return -1;
    }
}
/* Name: Jason Medeiros
 * Course: ICS4U1
 * Teacher: Ms.Lam
 * Purpose: Implement various sorting algorithms
 */

public class Sort {
    public static void main(String[] args) {
        int[] a = {5, 8, 2, 9, 3, 6};
        cocktailSort(a);
        for (int i: a) System.out.print(i + " "); System.out.println();
    }
    static void cocktailSort(int[] a) {
        boolean sorted = false;
        int l = 0, r = a.length;
        while (!sorted) {
            sorted = true;
            for (int i = l; i < r-1; i++) {
                if (a[i] > a[i+1]) {
                    sorted = false;
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            for (int i = r-1; i > l; i--) {
                if (a[i] < a[i-1]) {
                    sorted = false;
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                }
            }
        r--;
        }
    }
    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i; 
            int temp = a[i];
            while (j > 0 && a[j-1] > temp) {
                a[j] = a[--j];
            }
            a[j] = temp;
        }
    }
    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int mini = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[mini]) mini = j;
            }
            int temp = a[i];
            a[i] = a[mini];
            a[mini] = temp;
        }
    }
    static void bubbleSort(int[] a) {
        boolean sorted = false;
        for (int r = a.length-1; r > 0 && !sorted; r--) {
            sorted = true;
            for (int l = 0; l < r; l++) {
                if (a[l] > a[l+1]) {
                    sorted = false;
                    int temp = a[l];
                    a[l] = a[l+1];
                    a[l+1] = temp;
                }
            }
        }
    }
}

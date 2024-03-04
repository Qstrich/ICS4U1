public class Sort {
    public static void main(String[] args) {
        int[] a = {5, 8, 2, 9, 3, 6};
        insertionSort(a);
        for (int i: a) System.out.print(i + " "); System.out.println();
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
}

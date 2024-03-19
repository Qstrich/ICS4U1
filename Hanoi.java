
class Hanoi {
    public static void main(String[] args) {
        hanoi(3);
    }
    static void hanoi(int n) {
        hanoi(n, 'A', 'B', 'C');
    }
    static void hanoi(int n, char from, char mid, char to) {
        if (n == 1) {
            System.out.println("" + from + " " + to);
            return;
        }
        hanoi(n-1, from, to, mid);
        System.out.println("" + from + " " + to);
        hanoi(n-1, mid, from, to);
    }
}
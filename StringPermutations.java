import java.util.*;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perm("oaT");
        
    }
    static void unique(String s) { unique(s, "", s.length()); }
    static void unique(String str, String s, int n) {
        if (n == s.length()) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            unique(str.substring(0, i) + str.substring(i + 1), s + str.charAt(i), n);
        }
    }
    static void perm(String s) { perm(s, "", s.length()); }
    static void perm(String str, String s, int n) {
        if (n == s.length()) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            perm(str, s + str.charAt(i), n);
        }
    }
}
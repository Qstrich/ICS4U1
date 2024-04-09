package RecursivePermutations;
import java.util.*;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perm("hell");
        
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
    static void perm(String s) { perm(s, 0); }
    static void perm(String str, int idx) {
        if (idx == str.length()) {
            System.out.println(str);
            return;
        }
        int[] freq = new int[26];
        for (int i = idx; i < str.length(); i++) {        
            if (freq[str.charAt(i) - 'a'] > 0) continue;
            perm(swap(str, i, idx), idx+1);
            freq[str.charAt(i) - 'a']++;
        }
    }
    static String swap(String s, int i, int j) {
        char[] c = s.toCharArray();
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        return new String(c);
    }
}
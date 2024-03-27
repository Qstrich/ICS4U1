class RecursionString {
    public static void main(String[] args) {
        System.out.println(length("hello"));
        System.out.println(equalsIgnoreCase("hello", "HELLO"));
        System.out.println(countChar("Hello", 'l'));
        System.out.println(equalsIgnoreVowel("Hello", "Hell"));
        System.out.println(moveToEnd("Jimmie", 'i'));
        System.out.println(reverse("Hello"));
        System.out.println(palindrome("anana"));
    }
    public static int length(String s) {
        if (s.isEmpty()) return 0;
        return length(s.substring(1)) + 1;
    }
    public static boolean equalsIgnoreCase(String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()) return true;
        if (s1.isEmpty() || s2.isEmpty()) return false;
        if (!(s1.charAt(0) + "").equalsIgnoreCase(s2.charAt(0) + "")) return false;
        return equalsIgnoreCase(s1.substring(1), s2.substring(1));
    }
    public static int countChar(String s, char c) {
        if (s.isEmpty()) return 0;
        return (c == s.charAt(0) ? 1 : 0) + countChar(s.substring(1), c);
    }
    public static boolean equalsIgnoreVowel(String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()) return true;
        if (s1.isEmpty() || s2.isEmpty()) return false;
        String vowels = "aeiouAEIOU";
        if (vowels.indexOf(s1.charAt(0)) != -1) return equalsIgnoreVowel(s1.substring(1), s2.substring(0));
        if (vowels.indexOf(s2.charAt(0)) != -1) return equalsIgnoreVowel(s1.substring(0), s2.substring(1));
        if (!(s1.charAt(0) + "").equalsIgnoreCase(s2.charAt(0) + "")) return false;
        return equalsIgnoreVowel(s1.substring(1), s2.substring(1));
    }
    public static String moveToEnd(String s, char x) {
        if (s.isEmpty()) return "";
        if (s.charAt(0) == x) return s.substring(1) + x;
        return s.charAt(0) + s.substring(1);
    }
    public static String reverse (String s) {
        if (s.isEmpty()) return "";
        return s.substring(1) + s.charAt(0);
    }
    public static boolean palindrome(String s) {
        if (s.length() < 2) return true;
        if (s.charAt(0) != s.charAt(s.length()-1)) return false;
        return palindrome(s.substring(1, s.length()-1));
     }
}
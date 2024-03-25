class RecursionString {
    public static void main(String[] args) {

    }
    public static int length(String s) {
        if (s.isEmpty()) return 0;
        return length(s.substring(1)) + 1;
    }
    public static boolean equalsIgnoreCase(String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()) return true;
        if (s1.isEmpty() || s2.isEmpty()) return false;
        if (!Character.equalsIgnoreCase(s2.charAt(0), s1.charAt(0))) return false;
        return equalsIgnoreCase(s1.substring(1), s2.substring(1));
    }
    public static int countChar(String s, char c) {
        if (s.isEmpty()) return 0;
        return c == s.charAt(0) ? 1 : 0 + countChar(s.substring(1), c);
    }
    public static boolean equalsIgnoreVowel(String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()) return true;
        if (s1.isEmpty() || s2.isEmpty()) return false;
        String vowels = "aeiouAEIOU";
        if (vowels.indexOf(s1.charAt(0)) != -1) return equalsIgnoreVowel(s1.substring(1), s2.substring(0));
        if (vowels.indexOf(s2.charAt(0)) != -1) return equalsIgnoreVowel(s1.substring(0), s2.substring(1));
        if (!Character.equalsIgnoreCase(s2.charAt(0), s1.charAt(0))) return false;
        return equalsIgnoreVowel(s1.substring(1), s2.substring(1));
    }
    public static String moveToEnd(String s, char x) {
        
    }
}
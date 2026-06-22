package Strings;

public class StringPalindrome {
    static void main() {
        String str="TALAT";
        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}

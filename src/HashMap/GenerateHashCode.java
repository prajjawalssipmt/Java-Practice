package HashMap;

public class GenerateHashCode {
    static void main() {

        System.out.println( hashing("ABC"));
        System.out.println( hashing("BAC"));
    }

    public static int hashing(String s){
        int hash=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hash+=(int)c;
        }

        return hash;
    }
}

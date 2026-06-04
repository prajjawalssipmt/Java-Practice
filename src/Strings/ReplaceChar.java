package Strings;

public class ReplaceChar {
    static void main() {
        String str="Prajjawal";
        String newStr="";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                newStr+='o';
            }else {
                newStr+=str.charAt(i);
            }
        }

        System.out.println(newStr);
    }
}
